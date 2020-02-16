package simple.alert.rule.condition;

public class Below extends Condition{
	
	public Below(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input < value;
	}

}
