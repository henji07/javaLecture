package chap19_multithread.clazz.exam09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _16_threadPool {

	public static void main(String[] args) {
		//스레드 풀 생성
		ExecutorService es = Executors.newFixedThreadPool(5);
	
		es.execute(new SumThread1()); //1~10합
		es.execute(new SumThread2()); //30~50합 
		
		//메인스레드가 돌면서 10이 되는 순간 shutdown되도록 
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
					if(i == 3) {
						break;
					}
		}
		//shutdownNow는 interrupt() 메소드를 호출하는 로직을 
		//포함하고 있어서 진행 중인 스레드들이 일시 정지 상태가 되면 
		//InterruptedException을 발생시켜 스레드 풀 종료 
		//es.shutdownNow();
		es.shutdown(); //바로 종료되도록
	}
}
