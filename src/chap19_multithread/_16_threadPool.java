package chap19_multithread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class _16_threadPool {

	public static void main(String[] args) {
		// 스레드 5개까지 가질 수 있는 스레드풀
		ThreadPoolExecutor es = 
				(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
		
		//Thread-0
		//스레드풀에서 동작할 t1 생성 
		PrintThread t1 = new PrintThread();
		t1.settName(t1.getName()); //자동으로 정해준 이름으로 바꿔줌
		//execute() : 해당 스레드를 풀에 등록하면서 start()도 호출 
		es.execute(t1);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//스레드 풀의 스레드들은 데몬 스레드가 아니어서 메인 스레드가 종료돼도 계속 남아서 작업 진행
		//이러한 문제를 방지하고자 메인 스레드가 종료되기 전에 shutdown()이나 shutdownNow()를 이용해서 
		//스레드 풀을 종료시킨 다음 메인 스레드가 종료되도록 한다. 
		es.shutdownNow(); // 없으면 메인스레가 끝나도 스레드풀이 안 끝나서 계속 run호출하게 됨 
	}

}

class PrintThread extends Thread {
	private String tName;
	
	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettName() {
		return tName;
	}

	@Override
	public void run() { //t1의 run이 실행됨 
		while(true) {
			System.out.println(tName + " 작업 진행");
		
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {
				System.out.println(tName + 
						" shutdownNow() 호출");
				return;
			}
		}
	}
}
