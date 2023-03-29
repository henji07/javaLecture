package chap12_nestedclass.clazz;

public class NestedClass {
	//인스턴스 중첩 클래스 
	//접근하려면 외부클래스의 객체를 생성한 후 접근 가능 
	//static이 안 붙은 클래스 
	public class Mul { 
		//static 변수나 메소드는 선언 불가 
		//final static 변수나 메소드는 상수라서 선언 가능
		int num1 = 100;
		int num2 = 2;
		
		int result = num1 * num2;

		//접근이 안 되기 대문에 getter setter 만들어서 사용하는 거임
		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public int getNum2() {
			return num2;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}
	}
	
	//정적 중첩 클래스 
	//외부클래스의 객체 생성 없이도 접근 가능 
	public static class Div {
		//static 변수나 메소드를 선언 가능 
		int num3 = 10;
		int num4 = 5;
		
		public int getNum3() {
			return num3;
		}

		public void setNum3(int num3) {
			this.num3 = num3;
		}

		public int getNum4() {
			return num4;
		}

		public void setNum4(int num4) {
			this.num4 = num4;
		}
		
		//result가 먼저 만들어져서 
		//num3, num4는 존재하지 않는 변수임 
		//바로 호출 가넝한
		public static int result = 10 / 5;
		
	}
}
