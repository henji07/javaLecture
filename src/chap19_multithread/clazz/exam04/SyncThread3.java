package chap19_multithread.clazz.exam04;

public class SyncThread3 extends Thread{
	private PrintNumWithWaitNotify pns;
	
	public void setPns(PrintNumWithWaitNotify pns) {
		this.pns = pns;
	}
	
	public PrintNumWithWaitNotify getPns() {
		return pns;
	}

	@Override
	public void run() {
		pns.printNum1(10);
	}
}
