package chap09_polymorphism.product;

public class _03_withPolymorphism {

	public static void main(String[] args) {
		// 1. 다형성을 이용해 Tv 바꾸기
		//코드 변경 많이 줄일 수 있음

		Tv tv = new LgTv();
		//삼성으로 바꾸고 싶으면 
		//Tv tv = new SamsungTv(); 이거만 바꾸면 됨!!
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		Object o = new LgTv();
		//모든 클래스에 영향을 주기 때문에 엄청난 확장성
		o = new SamsungTv();
		o = new Tv();
		
		//Map<key, value>
		//맵에서 키값을 통해 value 꺼내올 수 있음 
		//키는 String값으로 선언 많이 함 
		//value 값을 Object로 하면 아무 거나 들어갈 수 있음
		
		//{company: "현대"}
		
		System.out.println(tv.toString());
	}
}
