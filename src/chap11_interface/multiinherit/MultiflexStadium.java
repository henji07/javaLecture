package chap11_interface.multiinherit;

//interface 끼리는 extends
public interface MultiflexStadium extends Stadium, ConcertHall{
	
	//경기장 메소드, 콘서트홀 메소드 둘 다 사용 가넝
	
	//따로 가질 메소드
	void playSprorstAndConcert(); //경기 콘서트 동시 진행

}
