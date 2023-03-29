package chap12_nestedclass.clazz;

public class Add implements Calc {

	@Override
	public void calculator(int a, int b) {
		
		Calc calc = new Calc() {

			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b));
			}
			
		};
		
		calc.calculator(10, 20);
	
	}

}
