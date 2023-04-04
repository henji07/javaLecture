package chap999_arrangement.controll;

import java.util.Scanner;

public class _01controll {

	public static void main(String[] args) {
		// 사용자가 입력한 두 정수 중에서 큰 정수를 출력
		
		System.out.println("정수 두 개 입력하세욧!");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		sc.close();
	}
}
