package simple.alert.rule.alert;

public enum Alert {

	WARNING("WARNING"), CRITICAL("CRITICAL");

	private String text;

	private Alert(String text) {
		this.text = text;
	}

	public static Alert getAlert(String s) throws Exception {

		Alert alert = null;
		switch (s) {
		case "WARNING":
			alert = WARNING;
			break;
		case "CRITICAL":
			alert = CRITICAL;
			break;
		default:
			break;

		}

		if (alert == null) {
			throw new Exception("Alert Text not supported");
		}

		return alert;
	}

	public String getText() {
		return text;
	}
}
