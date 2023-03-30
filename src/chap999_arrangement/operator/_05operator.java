package chap999_arrangement.operator;

import java.util.Scanner;

public class _05operator {

	public static void main(String[] args) {
		// 삼항연산자를 이용하여 
		//사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력
		
		System.out.println("정수를 입력하세요.(0 제외)");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("0은 홀수도 짝수도 아녀요...");
		} else {
		System.out.println(input % 2 == 0? "짝수" : "홀수");
		}
		

	}

}
