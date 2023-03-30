package chap999_arrangement.casting;

import java.util.Scanner;

public class _03casting {
	public static void main(String[] args) {
		// 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력
		
		System.out.println("실수 하나를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		
		
		System.out.println((int)a);

	}

}
