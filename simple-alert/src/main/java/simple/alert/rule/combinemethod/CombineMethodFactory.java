package simple.alert.rule.combinemethod;

public class CombineMethodFactory {

	public static CombineMethod createMethod(String s) throws Exception {

		CombineMethod result = null;
		if (s.length() == 0 || s.equals("AND")) {
			result = new AndMethod();
		} else if (s.equals("OR")) {
			result = new OrMethod();
		}
		if (result == null) {
			throw new Exception("Combine Method not supported");
		}
		return result;
	}

}
