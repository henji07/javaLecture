package chap18_enum;

import chap18_enum.enums.Calculator;

public class _06_abstractMethodEnum {

	public static void main(String[] args) {
	
		//각각의 함수마다 다른 기능 부여할 수 있음
		Calculator add = Calculator.PLUS;
		int result = add.calculate(10, 5);
		System.out.println(result);
		
		System.out.println();
		
		//배열에 넣기 
		Calculator[] cArr = Calculator.values();
		for(Calculator c : cArr) {
			System.out.println(c.calculate(10, 4));
		}
	}
}
