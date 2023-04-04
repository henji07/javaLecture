package chap19_multithread.clazz.exam01;

public class PrintNumWithoutSync {
	//매개변수 
	private int num;

	//setter
	public void setNum(int num) {
		this.num = num;
	}
	
	//메소드 
	public void printNum1(int num) {
		this.setNum(num);
		for(int i = 1; i <= this.num; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
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
