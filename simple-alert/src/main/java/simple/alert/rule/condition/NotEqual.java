package simple.alert.rule.condition;

public class NotEqual extends Condition{
	
	public NotEqual(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input != value;
	}

}
