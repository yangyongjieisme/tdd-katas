package simple.alert.rule.condition;

public class Above extends Condition{
	
	public Above(int value) {
		super(value);
		
	}

	@Override
	public boolean testCondition(int input) {
		return input > this.value;
	}

}
