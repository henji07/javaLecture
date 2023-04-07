package chap19_multithread.clazz.exam10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _17_threadEx {

	public static void main(String[] args) {
		
		//객체 생성 
		BoardDAO boardDAO = new BoardDAO();
		
		//최대 스레드 개수가 100인 스레드풀 생성
		//풀에 생성된 스레드를 사용자에게 하나씩 대여해서 사용자가 요청한 작업을 처리하게 된다.
		//사용자가 요청한 작업이 끝나면 다시 스레드를 반납 받아서 대기 중인 사용자에게 다시 대여
		//100명까지의 사용자 요청만 동시에 처리하고 
		//먼저 끝난 작업이 있으면 대기하고 있는 사용자에게 반납 받은 스레드를 다시 대여
		//(1~100 -> 1번 작업이 끝나면 2~100 1번 스레드를 101번 사용자에게 다시 대여 -> 2~101)
		ExecutorService se = Executors.newFixedThreadPool(100);
		
			
			//아래 방식은 스레드가 기하급수적으로 생성되기 때문에
			//많은 사용자가 접속하면 서버에 과부하가 발생한다. 
			//원하는 최대 스레드의 개수를 지정해서 스레드풀로 관리.
			Thread thread = new Thread() {
				@Override
				public void run() {
					System.out.println(boardDAO.selectBoardList());
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}			
			};
			//thread.start();
			
			//스레드 풀에 있는 스레드에 작업을 매핑해주고
			//스레드.start() 메소드도 호출해줌
			//스레드 풀에 스레드가 없을 때는 대기 
			se.execute(thread);
	}
}
