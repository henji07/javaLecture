package chap999_arrangement.operator;

import java.util.Scanner;

public class _04operator {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성
		
		System.out.println("문자열 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.equals("구만짱짱")) {
			System.out.println("입력한 문자열은 \"구만짱짱\"");
			
		} else {
			System.out.println("입력한 문자열은 \"구만짱짱\"이 아니여요.");
		}
		

	}

}
