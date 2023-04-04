package chap999_arrangement.controll;

import java.util.Scanner;

public class _07controll {

	public static void main(String[] args) {
		// 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, 
		//"No"인 경우 "아니오"를 출력하고, 
		//그 외의 경우에는 "잘못 입력하셨습니다."를 출력
		
		System.out.println("김구만씨를 아시나요...? (Yes/No)");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		switch(str) {
			case "Yes" : 
				System.out.println("예 좋아합니당");
				break;
			case "No" :
				System.out.println("아니오... 그게 누구죠...?");
				break;
			default : 
				System.out.println("잘못 입력하셨어요 ^^");
				break;
		}
		sc.close();
	}
}
