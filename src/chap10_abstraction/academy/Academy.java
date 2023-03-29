package chap10_abstraction.academy;


//추상클래스 
public abstract class Academy {
	
	//속성
	public int classCnt;
	public int studentCnt;
	public int teacherCnt;
	public int subjectCnt;
	
	
	//추상 메소드 
	public abstract void teach();
	public abstract void homework();
	public abstract void rest();
	public abstract void attendance();
}
