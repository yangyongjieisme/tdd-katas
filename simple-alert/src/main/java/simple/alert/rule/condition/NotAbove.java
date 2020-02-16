package simple.alert.rule.condition;

public class NotAbove extends Condition{
	
	public NotAbove(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input <= value;
	}

}
