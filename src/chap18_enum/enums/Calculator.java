package chap18_enum.enums;

public enum Calculator {
	
	PLUS("+") {
		@Override
		public int calculate(int a, int b) {
			return a + b;
			
		}
	}, 
	MINUS("-") {
		@Override
		public int calculate(int a, int b) {
			return a - b;
			
		}
	}, 
	MULTIPLY("*") {
		@Override
		public int calculate(int a, int b) {
			return a * b;
	
		}
	}, 
	DIVIDE("/") {
		@Override
		public int calculate(int a, int b) {
			if(b == 0)
				throw new ArithmeticException ("분모가 0이 될 수 없습니다.");
			return a / b;
		}
	};
	
	//매개변수
	private String operator;
	
	//생성자
	Calculator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}
	
	//추상메소드 선언 
	public abstract int calculate(int a, int b);
}
