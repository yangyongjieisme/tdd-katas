package simple.alert.rule.condition;

public class Equal extends Condition{
	
	public Equal(int value) {
		super(value);
	}

	@Override
	public boolean testCondition(int input) {
		return input == value;
	}

}
