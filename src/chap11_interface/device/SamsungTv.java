package chap11_interface.device;

public class SamsungTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("Samsung TV 전원을 켭니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV 전원을 끕니다.");
		
	}

	@Override
	public void show() {
		System.out.println("Samsung TV 화면을 켭니다.");
		
	}

	@Override
	public void sound() {
		System.out.println("Samsung TV 소리를 켭니다.");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("Samsung TV 채널을 " + channel + "로 변경합니다.");
		
	}

}
