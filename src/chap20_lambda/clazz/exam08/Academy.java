package chap20_lambda.clazz.exam08;

public class Academy {
	
	//필드
	private String subject;
	private int stuCnt;
	private int lecTime;
	
	
	//생성자
	//기본 생성자 - 매개변수 X
	public Academy() {
		
	}
	
	//매개변수 1, 2, 3 생성자 
	public Academy(String subject) {
		this.subject = subject;
	}
	
	public Academy(String subject, int stuCnt) {
		this.subject = subject;
		this.stuCnt = stuCnt;
	}
	
	public Academy(String subject, int stuCnt, int lecTime) {
		this.subject = subject;
		this.stuCnt = stuCnt;
		this.lecTime = lecTime;
	}
	
	//메소드 
	public void lectureInfo() {
		System.out.println("과목: " + this.subject);
		System.out.println("수강생: " + this.stuCnt);
		System.out.println("강의시간: " + this.lecTime);
	}

	
	//getter, setter 
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStuCnt() {
		return stuCnt;
	}

	public void setStuCnt(int stuCnt) {
		this.stuCnt = stuCnt;
	}

	public int getLecTime() {
		return lecTime;
	}

	public void setLecTime(int lecTime) {
		this.lecTime = lecTime;
	}
	
	
	
	
	
	
	

}
