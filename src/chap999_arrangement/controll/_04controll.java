package chap999_arrangement.controll;

import java.util.Scanner;

public class _04controll {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 
		//3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
		
		System.out.println("숫자를 입력하세욧!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num % 3) {
			case 0 : 
				System.out.println("3의 배수입니다.");
				break;
			default : 
				System.out.println("3의 배수가 아니여라");
				break;
		}
		sc.close();
	}
}
