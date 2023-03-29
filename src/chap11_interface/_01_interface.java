package chap11_interface;

import chap11_interface.buildings.Building;
import chap11_interface.buildings.HighBuilding;

public class _01_interface {

	public static void main(String[] args) {
		
		//인터페이스는 인스턴스화가 불가능하기 때문에
		//상속 받은 자식클래스를 인스턴스화해서 사용한다.
		//Building bd = new Building(); -> 이거 안 됨 
		Building bd = new HighBuilding();
		
		bd.build();
		bd.turnOnAircon();
		int price = bd.getParkingPrice(120);
		System.out.println("총 주차비는 " + price + "원 입니다.");

	}
}
