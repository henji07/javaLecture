package chap19_multithread.clazz.exam03;

public class _09_SyncShareObj {

	public static void main(String[] args) {
		// 
		PrintNumWithSync pns = new PrintNumWithSync();
		
		SyncThread1 t1 = new SyncThread1();
		SyncThread2 t2 = new SyncThread2();
		
		t1.setPns(pns);
		t2.setPns(pns);
		
		//t1스레드가 공유 객체인 pns의 num을 선점했기 때문에
		//동기화 블록과 메소드를 통해서 선점한 스레드의 작업이
		//종료되기 전까지는 num을 사용할 수 없도록 잠금처리했고
		//그래서 num을 사용할 수 있는 t1의 작업 종료 때까지 대기 
		t1.start();
		t2.start();

	}

}
