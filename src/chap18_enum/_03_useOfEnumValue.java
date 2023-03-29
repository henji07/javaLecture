package chap18_enum;

import chap18_enum.enums.ValueMonth;

public class _03_useOfEnumValue {

	public static void main(String[] args) {
		
		//enum의 객체 만들 때 생성자가 자동 호출
		//호출한 상수 값이 생성자의 매개변수로 들어가서 
		//선언되어 있는 변수에 대입된다.
		ValueMonth mar = ValueMonth.MAR;
		
		//getter메소드를 이용해서 출력, 사용할 수 있게됨
		//자동으로 3 찍힘 
		System.out.println(mar.getMonthVal());

		
		
	//여기 다 객체 생성하는 거 
		
		//여러형태의 enum 객체 생성 
		ValueMonth jan = ValueMonth.JAN;
		
		//Integer, String valueOf로 객체 만드는 것과 동일
		ValueMonth feb = ValueMonth.valueOf("FEB");
		
		//어떤 값을 뽑아올 건지 ValueMonth 사용
		ValueMonth apr = Enum.valueOf(ValueMonth.class, "APR");
		
		System.out.println("jan : " + jan);
		System.out.println("feb : " + feb);
		System.out.println("apr : " + apr);

		//enum 객체 배열 
		//배열 형태로 리턴 받을 수 있음
		ValueMonth[] vmArr = ValueMonth.values();
		
		//v로 하나씩 받아서 찍어보는 거
		for(ValueMonth v : vmArr) {
			System.out.println(v.name() + "은 " + //이름 가져와서 찍어주기
						v.ordinal() + "인덱스에 있습니다."); //인덱스 가져오는 거
		}
	}

}
