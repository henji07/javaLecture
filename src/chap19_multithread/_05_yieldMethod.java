package chap19_multithread;

public class _05_yieldMethod {	
	
	static int flag = 0;
	
	public static void main(String[] args) {
			
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					if(flag > 0)
						//처음 스레드가 동작할 때는 
						//실행이 되지 않아 의미 없는 작업 
						//의미 없는 작업이 계속 진행되는 것을 방지하고자 다른 스레드 먼저 작업해라 
						//=> yield()
						System.out.println(i);
					else {
						i--;
						System.out.println("yield 호출됨");
						//다른 스레드로 순서를 양보해서
						//flag 값의 변화가 생겼을 때 
						//다시 if문 안의 작업이 실행되도록 
						//=> 다른 작업으로 넘긴 다음, 플래그에 변화가 생기면 실행할 수 있도록
						Thread.yield();  
						
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 6; i <= 10; i++) {
					System.out.println(i);
				}
				flag++;
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
