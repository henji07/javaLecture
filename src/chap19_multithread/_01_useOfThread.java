package chap19_multithread;

public class _01_useOfThread {

	public static void main(String[] args) {
		// 1. 스레드의 정의 
		//메인함수를 실행하면 스레드가 자동적으로 하나 만들어짐
		//그 돌아가는 스레드가 메인 스레드 뭔소린지 잘 모르겠음 
		//메인 메소드 안에서 정의한 스레드가 서브 스레드 
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println(i);
					
					try {
						//현재 실행되는 스레드 중지 0.5초 동안
						//멈추면 다음 스레드 동작 
						//대기 중인 메인스레드로 돌아간다.
						Thread.sleep(500); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		//Thread t1 = new Thread();
		
		//2. 스레드의 실행 
		//위에서 정의한 스레드가 시작됨
		thread.start();
		
		//t1.start(); 스레드 여러 개 만든 후 한번에 실행하면 멀티 스레드
		
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
			
			try {
				//현재 실행되는 스레드 중지 0.5초 동안
				//멈추면 다음 스레드 동작 
				//대기중인 서브스레드로 돌아간다. 
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
