package chap11_interface.buildings;

public interface Building {
	
	//모든 변수는 자동으로 상수화됨
	
	String price = "expensive"; 
	//price - 상수됨 선언할 때 값 지정 안 하면 에러
	int floors = 120; 
	
	//메소드는 자동으로 추상화됨
	void build(); //{} 만들면 에러
	void turnOnAircon();
	int getParkingPrice(int time);

}
