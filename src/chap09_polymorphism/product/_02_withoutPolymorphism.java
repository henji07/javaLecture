package chap09_polymorphism.product;

public class _02_withoutPolymorphism {

	public static void main(String[] args) {
		//1. 다형성 사용하지 않고 많은 전자기기 운용하기 
		LgTv lgtv = new LgTv();
		//SamsungTv stv = new SamsungTv();
		
//		stv.powerOn();
//		stv.operate(13);
//		stv.powerOff();
//		stv.powerOn();
		
		lgtv.powerOn();
		lgtv.operate(13);
		lgtv.powerOff();
		lgtv.powerOn();	
		//lg로 바꾸려면 객체 생성도 바꿔야 하고 
		//내용도 다 lgtv.으로 바꿔야 함 
	}
}
