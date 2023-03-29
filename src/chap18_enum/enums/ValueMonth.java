package chap18_enum.enums;

public enum ValueMonth {
	
	//DefaultMonth가 enum의 공통명칭
	
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), 
	JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	
	//int형 받을 수 있는 변수 선언
	private int monthVal;
	
	//생성자
	ValueMonth(int monthVal) {
		this.monthVal = monthVal;
	}

	//가져다 쓰기만 할 거라 getter만 
	public int getMonthVal() {
		return monthVal;
	}

}
