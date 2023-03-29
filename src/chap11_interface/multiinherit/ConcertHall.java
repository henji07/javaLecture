package chap11_interface.multiinherit;

public interface ConcertHall {
	
	//변수는 인터페이스에서 많이 안 씀 기능만 
	void printSchedule(int month); //일정
	int getTicketPrice(int people); //가격
	void getRemainSeat(); //남은 좌석

}
