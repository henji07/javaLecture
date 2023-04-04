package chap999_arrangement.variables;

import java.util.Scanner;

public class _04variables {

	public static void main(String[] args) {
		// 사용자가 입력한 5개의 정수의 합계와 평균을 출력
		
		System.out.println("정수 5개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		int sum = n1 + n2 + n3 + n4 + n5;
		double avg = sum/5;
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		sc.close();
	}
}
