package chap999_arrangement.casting;

import java.util.Scanner;

public class _04casting {

	public static void main(String[] args) {
		// 사용자가 한 개의 실수를 입력하면 
		//그 실수의 제곱의 결과를 문자열로 변환하여 출력
		
		System.out.println("실수 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double result = a*a;
		
		String s = Double.toString(result);
		
		System.out.println(s);
		
		//String타입인지 판별하는 연산
		System.out.println("String으로 변환됐는가여?");
		System.out.println(s instanceof String);

	}

}
