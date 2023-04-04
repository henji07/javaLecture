package chap999_arrangement.controll;

import java.util.Scanner;

public class _05controll {

	public static void main(String[] args) {
		//사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고, 
		//짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성
		
		System.out.println("정수 하나 입력하세욧!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0) {
				System.out.println("0은 0이라오..");
		} else if (num % 2 == 0){
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		sc.close();
	}
}
