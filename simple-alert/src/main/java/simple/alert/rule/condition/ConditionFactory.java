package simple.alert.rule.condition;

public class ConditionFactory {

	public static Condition createCondition(String condition, String valueText) throws Exception {

		Condition result = null;

		String shortText = condition.substring(0, 3);
		int value = Integer.parseInt(valueText);

		switch (shortText) {
		case "ABO":
			result = new Above(value);
			break;
		case "BEL":
			result = new Below(value);
			break;
		case "EQU":
			result = new Equal(value);
		case "NOT":
			switch (condition) {
			case "NOT-ABOVE":
				result = new NotAbove(value);
				break;
			case "NOT-BELOW":
				result = new NotBelow(value);
				break;
			case "NOT-EQUAL":
				result = new NotEqual(value);
				break;
			default:

				break;
			}
			break;
		case "BRE":
			switch (condition) {
			case "BREAK-ABOVE":
				result = new BreakAbove(value);
				break;
			case "BREAK-BELOW":
				result = new BreakBelow(value);
				;
				break;
			case "BREAK-EQUAL":
				result = new BreakEqual(value);
				break;
			default:

				break;
			}
			break;
		default:

			break;
		}
		if (result == null) {
			throw new Exception("Condition not supported");
		}
		return result;
	}

}
