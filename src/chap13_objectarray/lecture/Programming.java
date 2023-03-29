package chap13_objectarray.lecture;

public class Programming implements ILecture {
	
	@Override
	public void proceedLecture() {
		System.out.println("프로그래밍 수업을 40명의 학생이 듣습니다." );
		System.out.println("수업 시간은 70분입니다." );
	}
}
