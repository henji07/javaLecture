package chap999_arrangement.controll;

import java.util.Scanner;

public class _06controll {

	public static void main(String[] args) {
		//사용자가 입력한 5개의 정수중 가장 큰 수를 출력
				
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE; //초기값은 가장 작은 정수
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 정수를 입력하세요."); 
			int num = sc.nextInt();
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("가장 큰 수 : " + max);
		sc.close();
	}
}
