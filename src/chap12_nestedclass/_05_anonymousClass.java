package chap12_nestedclass;

import chap12_nestedclass.clazz.Calc;

public class _05_anonymousClass {

	public static void main(String[] args) {
		//익명 중첩 클래스 선언과 Calc 인터페이스 구현 
		//익명 중첩 클래스는 추상클래스나 인터페이스를 
		//구현한 클래스 없이 사용할 수 있게 해줌 
		//메인함수에서 구현이 된 거
		//Add가 삭제되면 Calc를 상속 받아서 구현한 클래스가 없음
		//Calc를 바로 구현해서 사용할 수 있음 
		Calc cal = new Calc() {
			@Override
			public void calculator(int a, int b) {
				System.out.println("결과는 " + (a + b));
			}
		};
		//바로 구현할 수 있음 
		cal.calculator(10, 20);
	}

}
