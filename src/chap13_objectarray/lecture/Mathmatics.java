package chap13_objectarray.lecture;

public class Mathmatics implements ILecture {

	
	@Override
	public void proceedLecture() {
		System.out.println("수학 수업을 30명의 학생이 듣습니다." );
		System.out.println("수업 시간은 60분입니다." );
	}
}
