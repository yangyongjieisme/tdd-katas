package simple.alert.rule.condition;

public class BreakEqual extends Condition {

	public BreakEqual(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input == value + 1 || input == value - 1;
	}

}
