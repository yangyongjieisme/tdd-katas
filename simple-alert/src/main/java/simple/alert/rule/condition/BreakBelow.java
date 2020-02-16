package simple.alert.rule.condition;

public class BreakBelow extends Condition{
	
	public BreakBelow(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input == value - 1;
	}

}
