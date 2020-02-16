package simple.alert.rule.combinemethod;

import java.util.List;

import simple.alert.rule.condition.Condition;

public abstract class CombineMethod {
	
	public abstract boolean combineCondition(List<Condition> conditions,int input);
}
