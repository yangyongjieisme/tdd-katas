package simple.alert.rule;

import java.util.List;

import simple.alert.rule.alert.Alert;
import simple.alert.rule.combinemethod.CombineMethod;
import simple.alert.rule.condition.Condition;

public class Rule {

    private CombineMethod combineMethod;
    private List<Condition> conditions;
    private Alert alert;

    public Rule(CombineMethod combineMethod, List<Condition> conditions, Alert alert) {
        super();
        this.combineMethod = combineMethod;
        this.conditions = conditions;
        this.alert = alert;
    }

	public CombineMethod getCombineMethod() {
		return combineMethod;
	}

	public void setCombineMethod(CombineMethod combineMethod) {
		this.combineMethod = combineMethod;
	}

	public List<Condition> getConditions() {
		return conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public Alert getAlert() {
		return alert;
	}

	public void setAlert(Alert alert) {
		this.alert = alert;
	}

	@Override
	public String toString() {
		return "Rule [combineMethod=" + combineMethod + ", conditions=" + conditions + ", alert=" + alert + "]";
	}


}