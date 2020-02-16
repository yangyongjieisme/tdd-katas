package simple.alert.rule.condition;

public class NotBelow extends Condition{
	
	public NotBelow(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input >= value;
	}

}
