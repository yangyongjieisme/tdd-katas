package simple.alert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import simple.alert.rule.Rule;
import simple.alert.rule.alert.Alert;
import simple.alert.rule.combinemethod.CombineMethod;
import simple.alert.rule.combinemethod.CombineMethodFactory;
import simple.alert.rule.condition.Condition;
import simple.alert.rule.condition.ConditionFactory;

public class AlertSystemMain {

	private static final String OK = "OK";

	public static void main(String args[]) {
		if (args.length != 1 || args[0].length() == 0) {
			System.out.println("Please enter rule");
			System.exit(0);
		}
		Scanner scan = new Scanner(System.in);
		String input = "";
		if (scan.hasNext()) {
			input = scan.next();
			System.out.println("输入的数据为：" + input);
		}
		scan.close();
		String ruleText = args[0];
		try {
			Rule rule = formRule(ruleText);
			System.out.println(analyseRule(rule, input.split(",")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	private static Rule formRule(String rule) throws Exception {
		// assume rule format like following : AND(BELOW 3,ABOVE 1) CRITICAL

		CombineMethod method = CombineMethodFactory.createMethod(rule.substring(0, rule.indexOf("(")));
		String conditionAll = rule.substring(rule.indexOf("(") + 1, rule.indexOf(")"));
		List<String> conditionRawList = Arrays.asList(conditionAll.split(","));
		// Since Lamda not support for exception throwing out , need to use old way
		/*
		 * List<Condition> conditions = conditionRawList.stream().map(c -> { String
		 * temp[] = c.split(" "); return ConditionFactory.createCondition(temp[0],
		 * temp[1]);
		 * 
		 * }).collect(Collectors.toList());
		 */
		List<Condition> conditions = new ArrayList<>();
		for (String s : conditionRawList) {
			String temp[] = s.split(" ");
			conditions.add(ConditionFactory.createCondition(temp[0], temp[1]));
		}

		String alertText = rule.substring(rule.indexOf(")") + 2, rule.length());
		return new Rule(method, conditions, Alert.getAlert(alertText));
	}

	private static String analyseRule(Rule rule, String[] input) {

		List<String> textList = new ArrayList<String>();
		Arrays.asList(input).stream().forEach(in -> {
			boolean needAlert = rule.getCombineMethod().combineCondition(rule.getConditions(), Integer.parseInt(in));
			if (needAlert) {
				textList.add(rule.getAlert().getText());
			} else {
				textList.add(OK);
			}
		});

		return textList.toString();

	}
}
