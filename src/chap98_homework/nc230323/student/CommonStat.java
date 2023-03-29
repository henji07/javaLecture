package chap98_homework.nc230323.student;

public class CommonStat {
	public int sno; //학번
    public StringBuffer name; //이름 
    //메모리에 저장되어 있는 값을 직접 변경하려고 StringBuffer 쓰는 거?
    public String[] subject; //해당 학생이 수강한 과목배열
	public int[] finalExam; //해당 학생이 수강한 과목의 기말고사 점수배열
	
	//학번, 이름만 받아온 생성자 
	public CommonStat(int sno, StringBuffer name) {
		this.sno = sno;
		this.name = name;
	}
}
