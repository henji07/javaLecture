package chap999_arrangement.operator;

import java.util.Scanner;

public class _08operator {

	public static void main(String[] args) {
		//사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 
		//입력한 숫자는 xxxxxx입니다." 라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		//공백으로 구분
		System.out.print("숫자와 문자열을 입력하세요.(\'숫자(공백)문자\' 형태로)");
		int num = sc.nextInt();
		String str = sc.nextLine().trim();
		
	
		System.out.println("입력한 문자열은 " + str + "이고");
		System.out.println("입력한 숫자는 " + num + "입니다.");
		
		sc.close();
	}
}
