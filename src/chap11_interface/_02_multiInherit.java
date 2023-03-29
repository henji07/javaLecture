package chap11_interface;

import chap11_interface.multiinherit.MultiflexStadium;
import chap11_interface.multiinherit.SeoulMultiflexStadium;


//MultiflexStadium이 Stadium과 ConcertHall의 형태를 가지고 잇기 때문에
//SeoulMultiflexStadium도 Stadium, ConcertHall의 형태를 가지고 된다.
//Stadium타입의 변수나 ContcertHall타입의 변수로도 사용가능
//몇 번 상속을 거쳤든, 최상위 조상의 기능과 형태의 변수 사용 가넝한~~~~
public class _02_multiInherit {

	public static void main(String[] args) {
		
		MultiflexStadium ms = new SeoulMultiflexStadium();
		
		ms.getSportsSchedule(3);
		int sportsTicket = ms.getSportsTicketPrice(2);
		ms.getSupportersItem(2);

		ms.getRemainSeat();
		int concerTicket = ms.getTicketPrice(5);
		ms.printSchedule(4);
		ms.playSprorstAndConcert();
	}
}
