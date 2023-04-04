package chap999_arrangement.controll;

import java.util.Scanner;

public class _09controll {

	public static void main(String[] args) {
		//사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 
		//모두 홀수인 경우 "모두 홀수입니다." 
		//그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력
		
		
		Scanner sc = new Scanner(System.in);
		
			int count1 = 0; //홀수
			int count2 = 0; //짝수
			
				for(int i = 1; i <= 3; i++) {
					System.out.println(i + "번째 정수 입력");
					int num = sc.nextInt();
				
					 if (num % 2 == 0) {
						count2++;
					} else {
						count1++;
					}		
				}
				
				if (count2 == 3) {
					System.out.println("모두 짝수입니다.");
				} else if (count1 == 3) {
					System.out.println("모두 홀수입니다.");
				} else {
					System.out.println("짝수 : " + count2 + "개" + 
										", 홀수 : " + count1 + "개");
				}
				sc.close();
	}
}
