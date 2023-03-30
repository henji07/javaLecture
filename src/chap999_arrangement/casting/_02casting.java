package chap999_arrangement.casting;

import java.util.Scanner;

public class _02casting {

	public static void main(String[] args) {
		// 사용자가 두 개의 정수(a, b)를 입력해서 
		//a / b의 연산결과를 실수로 출력 (b != 0)
		
		System.out.println("두 개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double result = a / b;
			System.out.println(a + " / " + b + " = " + result);
	
		} catch(ArithmeticException e) { 
			System.out.println("0으로 나눌 수 없어여~");
		}
		
		

	}

}
