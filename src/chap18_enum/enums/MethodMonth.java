package chap18_enum.enums;

public enum MethodMonth {
	
	//DefaultMonth가 enum의 공통명칭
	
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), 
	JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	
	//int형 받을 수 있는 변수 선언
	private int monthVal;
	
	//생성자
	MethodMonth(int monthVal) {
		this.monthVal = monthVal;
	}

	//가져다 쓰기만 할 거라 getter만 
	public int getMonthVal() {
		return monthVal;
	}
	
	//입력한 달과 같은지 비교하는 메소드
	//객체 만들어서 바로 쓸 수 있게 static
	//values()로 값 꺼내서 
	//배열 순회하면서 입력한 달과 출력 달이 같도록 
	public static void printMonth (int month) {
		MethodMonth[] monthArr = values();
		for(int i = 0; i < monthArr.length; i++) {
			if(monthArr[i].getMonthVal() == month) {
				System.out.println("입력한 달은 " + 
			                      monthArr[i].getMonthVal() +
			                      "월 입니다.");
			}
		}
	} 
	//12보다 작아질 때까지 remain해서 빼주고 36개월 뒤 같이 수 커질 때도 계산하게
	
	//메소드 
	//12월 넘어가면 다시 1부터 시작 
	//12월 안 넘으면 그냥 출력 
//	public void printAddMonth(int month) {
//		if(this.getMonthVal() + month <= 12) {
//			System.out.println(month + "개월 뒤는 " + 
//					(this.getMonthVal() + month) + "월 입니다.");
//		} else {
//			int remain = this.getMonthVal() + month - 12;
//			System.out.println(month + "개월 뒤는 "
//					+ (JAN.monthVal + remain - 1) 
//					+ "월입니다.");
//		}
//			
//	}
	
	public void printAddMonth(int month) {
		if(this.getMonthVal() + month <= 12) {
			System.out.println(month + "개월 뒤는 "
					+ (this.getMonthVal() + month) 
					+ "월입니다.");
		} else {
			int remain = this.getMonthVal() + month - 12;
			
			while(remain > 12) {
				remain -= 12;
			}
			
			System.out.println(month + "개월 뒤는 "
					+ (JAN.monthVal + remain - 1) 
					+ "월입니다.");
		}
	}

}
