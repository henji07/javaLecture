package chap999_arrangement.variables;

import java.util.Scanner;

public class _05variables {

	public static void main(String[] args) {
		//사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력
		System.out.println("정수 3개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int min = Math.min(Math.min(n1, n2), n3);
		int max = Math.max(Math.max(n1, n2), n3);
		int mid = n1 + n2 + n3 - min - max;
		
		System.out.println("최소값 : " + min);
		System.out.println("중간값 : " + mid);
		System.out.println("최대값 : " + max);
		
		sc.close();
	}
}
