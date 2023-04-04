package chap999_arrangement.controll;

import java.util.Scanner;

public class _03controll {
	public static void main(String[] args) {
		// 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, 
		//"Python"인 경우 "공부중인 언어입니다."를 출력하고, 
		//그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
		
		System.out.println("프로그래밍 언어 \'영어로\' 입력하세욧!");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		switch(str) {
			case "Java" : 
				System.out.println("좋아하는 언어입니당");
				break;
			case "Python" :
				System.out.println("공부 중인 언어입니당");
				break;
			default : 
				System.out.println("다른 언어를 공부해보세요~");
				break;
		}
		sc.close();
	}
}
