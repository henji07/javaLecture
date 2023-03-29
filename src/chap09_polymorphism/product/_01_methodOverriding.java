package chap09_polymorphism.product;

public class _01_methodOverriding {

	public static void main(String[] args) {
		
		//1. 다형성의 구현
		//부모 형태의 변수에 자식 인스턴스(객체)를 담아 
		//다양한 형태로 사용한다. 
		ElectronicDevice ed = new Tv();
		ed.powerOn();
		ed.operate(11);
		ed.powerOff();
		
		//껐다 켜도
		ed.powerOn(); //저장된 채널 나옴
		
		ed = new AirCon();
		ed.powerOn();
		ed.operate(18);
		ed.powerOff();
		
		ed.powerOn(); //지정했던 온도 남겨져서 나옴

	}

}
