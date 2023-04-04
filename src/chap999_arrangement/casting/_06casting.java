package chap999_arrangement.casting;

import java.util.Scanner;

public class _06casting {

	public static void main(String[] args) {
		// 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자를 입력하세요.");
		char a = sc.next().charAt(0);
		System.out.println("두 번째 문자를 입력하세요.");
		char b = sc.next().charAt(0);
		
		int uniA = (int)a;
		int uniB = (int)b;
		
		System.out.println(a + " 유니코드 : " +uniA);
		System.out.println(b + " 유니코드 : " + uniB);
		
		sc.close();
	
	}
}
