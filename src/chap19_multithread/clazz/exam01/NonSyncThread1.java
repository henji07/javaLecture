package chap19_multithread.clazz.exam01;

public class NonSyncThread1 extends Thread{
	private PrintNumWithoutSync pns;
	
	//setter
	public void setPns(PrintNumWithoutSync pns) {
		this.pns = pns;
	}
	
	//getter
	public PrintNumWithoutSync getPns() {
		return pns;
	}

	@Override
	public void run() {
		pns.printNum1(10);
	}
}
