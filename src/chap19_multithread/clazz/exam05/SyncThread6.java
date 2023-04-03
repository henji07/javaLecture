package chap19_multithread.clazz.exam05;

public class SyncThread6 extends Thread{
	private PrintNumWithWaitNotify pns;

	public void setPns(PrintNumWithWaitNotify pns) {
		this.pns = pns;
	}
	
	public PrintNumWithWaitNotify getPns() {
		return pns;
	}
	
	@Override
	public void run() {
		pns.printNum2(10);
	}
}
