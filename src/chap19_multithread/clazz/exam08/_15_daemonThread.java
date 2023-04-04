package chap19_multithread.clazz.exam08;

public class _15_daemonThread {

	public static void main(String[] args) {
		
		AutoSaveThread ast = new AutoSaveThread();
		
		//AutoSaveThread 객체를 데몬 스레드로 설정
		ast.setDaemon(true);
		
		ast.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		
		//10초 후 메인 스레드 종료되는 순간
		//데몬 스레드도 자동 종료 
		System.out.println("메인 스레드 종료됨");
		System.out.println("데몬 스레드 AutoSaveThread도 자동으로 종료됨");
	}

}
