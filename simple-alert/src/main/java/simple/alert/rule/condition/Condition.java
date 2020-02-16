package simple.alert.rule.condition;

public abstract class Condition {

	protected int value;

	public Condition(int value) {
		this.value = value;
	}

	public abstract boolean testCondition(int input);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
