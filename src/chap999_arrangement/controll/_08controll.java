package chap999_arrangement.controll;

import java.util.Scanner;

public class _08controll {

	public static void main(String[] args) {
		//사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 
		//첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다." 
		//두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력
		
		System.out.println("정수 두 개~~");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println("첫 번째 수가 더 큽니다.");
		} else if (a < b){
			System.out.println("두 번째 수가 더 큽니다.");
		} else {
			System.out.println("두 수가 같습니다.");
		}
		
	}

}
