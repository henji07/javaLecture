package chap999_arrangement.controll;

import java.util.Scanner;

public class _02controll {

	public static void main(String[] args) {
		//사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력
		
		System.out.println("정수 하나 입력하세욧!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else if (num == 0){
			System.out.println("0은 0이라오...");
		} else {
			System.out.println("음수");
		}
			
	}

}
