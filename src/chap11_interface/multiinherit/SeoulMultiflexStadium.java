package chap11_interface.multiinherit;

public class SeoulMultiflexStadium implements MultiflexStadium {
//3개의 인터페이스 연결된 거
	
	@Override
	public void getSportsSchedule(int month) {
		System.out.println(month + "월에 예정된 경기는 수원 대 서울");
		
	}

	@Override
	public int getSportsTicketPrice(int people) {
		return people * 7000;
	}

	@Override
	public void getSupportersItem(int people) {
		System.out.println(people + "명의 아이템 구매 가격은" 
							+ (people * 15000) + "원 입니다.");
		
	}

	@Override
	public void printSchedule(int month) {
		System.out.println(month + "월에 예정된 콘서트는 구만 공연");
		
	}

	@Override
	public int getTicketPrice(int people) {
		System.out.println(people + "명의 아이템 구매 가격은" 
				+ (people * 15000) + "원 입니다.");
		return 0;
	}

	@Override
	public void getRemainSeat() {
		System.out.println("남아있는 총 좌석은 1000자리");
		
	}

	@Override
	public void playSprorstAndConcert() {
		System.out.println("수원 대 서울 경기에서 구만 콘서트도 동시에" + "진행될 예정입니다.");
		
	}
}
