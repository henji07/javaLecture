package chap10_abstraction.academy;

public class EnglishAcademy extends Academy {
	
	public void teach() {
		System.out.println("영어를 가르친다.");
	}
	
	public void homework() {
		System.out.println("숙제는 집에 가서 한다.");
	}
	
	public void rest() {
		System.out.println("영어학원 쉬는 시간");
	}
	
	public void attendance() {
		System.out.println("영어학원에 출석");
	}
}
