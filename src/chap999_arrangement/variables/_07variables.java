package chap999_arrangement.variables;

import java.util.Scanner;

public class _07variables {

	public static void main(String[] args) {
		// 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int f = 1;
		
		for(int i = input; i > 0; i--) {
			f *= i;
		}
		System.out.println(input + "! = " + f);
	}

}
