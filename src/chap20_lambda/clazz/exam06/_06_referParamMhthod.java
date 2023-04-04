package chap20_lambda.clazz.exam06;

public class _06_referParamMhthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(String :: toUpperCase);

	}
	
	public static void action(UpperCase uci) {
		String result = uci.allUpperCase("bit");
		
		System.out.println(result);
	}

}
