package chap19_multithread.clazz.exam07;

public class InterruptThread extends Thread {
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("스레드 실행됨");
				Thread.sleep(1);
				//Thread.interrupted(); //interrupt가 발생했는지 확인해주는 메소드 사용해서도 스레드 종료 가능
				}	
			} catch(InterruptedException ie) {
				//리소스 정리 
				
				System.out.println(ie.getMessage());
				System.out.println("스레드 종료");
			} finally {
				//try ~ catch 후처리
			} 
		}
	}