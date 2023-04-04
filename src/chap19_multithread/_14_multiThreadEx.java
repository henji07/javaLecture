package chap19_multithread;

public class _14_multiThreadEx {

	public static void main(String[] args) {
		
		//스레드 객체 생성
		Thread t1 = new Thread() {
			@Override 
			public void run() {
				for(int i = 1; i < 10; i++) {
					if(i % 3 == 0) {
						System.out.println(i);
				}
			}
		  }		
		};
		
		Thread t2 = new Thread() {
			@Override 
			public void run() {
				for(int i = 1; i < 10; i++) {
					if(i % 3 == 1) {
						System.out.println(i);
				}
			}
		  }		
		};
		
		Thread t3 = new Thread() {
			@Override 
			public void run() {
				for(int i = 1; i < 10; i++) {
					if(i % 3 == 2) {
						System.out.println(i);
				}
			}
		  }		
		};
		
		t1.start();
		try {
			t1.join(); //t1스레드가 작업 종료하기 전까지 메인스레드가 일시정지 상태여서 아래 코드 실행 안 됨 
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
