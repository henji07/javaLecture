package chap19_multithread.clazz.exam06;

public class _12_safeExitIf {

	public static void main(String[] args) {
		WhileThread wt = new WhileThread();
		
		wt.start();
		
		try {
			//main 스레드 1초 동안 일시 정지 
			//WhileThread가 1초 반복 실행  
			Thread.sleep(1000);
		} catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		wt.setStop(true);	//종료될 수 있도록
	}

}
