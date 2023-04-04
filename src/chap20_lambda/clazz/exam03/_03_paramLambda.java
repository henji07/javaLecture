package chap20_lambda.clazz.exam03;

public class _03_paramLambda {

	public static void main(String[] args) {
		// 
		
		MulAndDiv mad = new MulAndDiv();
		
		mad.action1((a) -> System.out.println(a * a));
		mad.action2((a, b) -> {
			System.out.println(a / b);
			System.out.println((a * a) / (b * b));
		});

	}

}
