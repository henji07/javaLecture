package chap999_arrangement.variables;

import java.util.Scanner;

public class _01variables {

	public static void main(String[] args) {
		//1. 사용자가 입력한 이름, 나이, 성별을 출력
		System.out.println("이름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		System.out.println("성별을 입력하세요.");
		String gender = sc.next();
		
		System.out.println("이름 : " + name + ", 나이 : " + 
							age + ", 성별 : " + gender);
		
	}
}
