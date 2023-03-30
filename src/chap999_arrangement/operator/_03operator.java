package chap999_arrangement.operator;

import java.util.Scanner;

public class _03operator {

	public static void main(String[] args) {
		// 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력
		//아니면 "2와 7의 공배수가 아님"이라고 출력
		
		System.out.println("정수 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 7 == 0 && num % 2 == 0) {
			System.out.println("2와 7의 공배수");
		} else {
			System.out.println("2와 7의 공배수가 아님 ");
		}

	}

}
