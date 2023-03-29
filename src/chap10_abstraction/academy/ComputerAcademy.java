package chap10_abstraction.academy;

public class ComputerAcademy extends Academy {
	
	//어노테이션 @~~
	//@Override : 오버라이드된 메소드라고 컴파일러에게 알림
	//@Override 없으면 컴파일러가 오버라이드된 메소드인지 
	//			부모와 자식을 계속 비교하면서 컴파일 
	
	@Override
	public void teach() {
		System.out.println("컴퓨터를 가르친다.");
	}
	
	public void homework() {
		System.out.println("숙제는 학원 컴퓨터로 한다.");
	}
	
	public void rest() {
		System.out.println("컴퓨터 쉬는 시간");
	}
	
	public void attendance() {
		System.out.println("컴퓨터 출석");
	}
}
