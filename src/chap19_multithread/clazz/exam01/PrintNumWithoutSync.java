package chap19_multithread.clazz.exam01;

public class PrintNumWithoutSync {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	public void printNum1(int num) {
		this.setNum(num);
		for(int i = 1; i <= this.num; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
	public void printNum2(int num) {
		this.setNum(num);
		for(int i = this.num; i <= this.num * 2; i++) {
			System.out.println(i);
		}
	}
}
