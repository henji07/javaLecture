package chap19_multithread.clazz.exam07;

public class InterruptThread2 extends Thread {
	
	@Override
	public void run() {
		
			while(true) {
				System.out.println("스레드 실행됨");
				//1. Thread.sleep(1);
				Thread.interrupted(); 
				//interrupt가 발생했는지 확인해주는 메소드 사용해서도 스레드 종료 가능
				//interrupt발생하면 true 리턴
				//true리턴하면 while문 종료, 스레드 종료 
				if(Thread.interrupted()) {
					break; 
				}
			}	
		
		}
	}