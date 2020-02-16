package simple.alert.rule.combinemethod;

import java.util.List;

import simple.alert.rule.condition.Condition;

public class OrMethod extends CombineMethod{

	@Override
	public boolean combineCondition(List<Condition> conditions, int input) {

		boolean needAlert = false;
		for (Condition c : conditions) {

			boolean res = c.testCondition(input);
			if (res) {
				needAlert = true;
				break;
			}
		}

		return needAlert;
	}
}
