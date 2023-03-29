package chap13_objectarray.lecture;

public class English implements ILecture {
	
	//이렇게 해도 됨 
	//변수만 가지고 있는 클래스 만들어서 상속해줘도 됨 
	// implements , extends 둘 다 쓸 수 있음 ㅎㅎ
	// extends 먼저 써주고 뒤에  implements 써줘야 함
//	private String subject;
//	private int studentCnt;
//	private int lectureTime;
//	
//	public English (String subject, int studentCnt, int lectureIime) {
//		this.lectureTime = lectureTime;
//		this.studentCnt = studentCnt;
//		this.subject = subject;
//	}
	
	@Override
	public void proceedLecture() {
		System.out.println("영어 수업을 20명의 학생이 듣습니다." );
		System.out.println("수업 시간은 50분입니다." );
	}
}
