package chap10_abstraction.product;

public class LgTv extends Tv {
	
	
	//여기서 구현하면 됨 
	public void powerOn() {
		System.out.println("lgTv 켬");
	
	}
	
	public void powerOff() {
		System.out.println("lgTv 끔");
	
	}
	
	public void operate(int channel) {
		System.out.println("lgTv 채널 " + channel + "로 변경");
		
		super.lastChannel = channel;
	}
}
