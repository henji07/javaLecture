package chap11_interface;

import chap11_interface.device.ElectronicDevice;
import chap11_interface.device.LgTv;
import chap11_interface.device.Tv;

public class _03_multiinherit {

	public static void main(String[] args) {
		
		Tv tv = new LgTv();
		
		tv.powerOn();
		tv.show();
		tv.sound();
		tv.reset();
		
		ElectronicDevice.warn();
		//static 메소드 사용하려면 
		//static 메소드가 선언된 클래스를 사용해서 호출한다. 
		
		//static 메소다는 상속받은 자식클래스에서 호출 불가능
		//Tv.warn();
		//Display.warn();
	}
}
