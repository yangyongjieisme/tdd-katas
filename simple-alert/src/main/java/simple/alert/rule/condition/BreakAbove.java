package simple.alert.rule.condition;

public class BreakAbove extends Condition{
	
	public BreakAbove(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input == value+1;
	}

}
