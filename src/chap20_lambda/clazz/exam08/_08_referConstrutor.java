package chap20_lambda.clazz.exam08;

public class _08_referConstrutor {

	public static void main(String[] args) {
		//각각 구현
		/*comLectureInfo((str, num) -> {
			return new Academy(str, num);
		});*/
		
		/*위에 쓴 것을 이렇게 써도 알아서 생성자 자동으로 호출
		 * 매개변수 일치하는 걸로 자동 매칭*/
		comLectureInfo(Academy :: new);
		
		/*engLectureInfo(str -> new Academy(str));*/
		engLectureInfo(Academy :: new);
	}
	
	//메소드 구현 
	public static void comLectureInfo(ComAcademy ca) {
		Academy ac = ca.getComAcademy("컴퓨터", 50);
		
		ac.setLecTime(10);
		
		ac.lectureInfo();
	}
	
	public static void engLectureInfo(EngAcademy ea) {
		Academy ac = ea.getEngAcademy("영어");
		
		ac.lectureInfo();
	}
	
}
