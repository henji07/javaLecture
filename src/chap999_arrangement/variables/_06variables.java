package chap999_arrangement.variables;

import java.util.Scanner;

public class _06variables {

	public static void main(String[] args) {
		// 사용자가 입력한 정수의 구구단을 출력
		System.out.println("2~9 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

			for (int j = 1; j <= 9; j++) {
				System.out.println(input + " x " + j + " = " + (input*j));
			}
		
	}

}
