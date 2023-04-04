package chap19_multithread.clazz.exam08;

public class AutoSaveThread extends Thread {
	
	//출력 메소드 
	public void save() {
		System.out.println("자동 저장되었습니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			save();
		}
	}
}
