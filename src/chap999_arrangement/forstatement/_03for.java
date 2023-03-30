package chap999_arrangement.forstatement;

import java.util.Scanner;

public class _03for {

	public static void main(String[] args) {
		// 사용자가 입력한 정수까지의 모든 소수를 출력
		
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//1은 소수가 아니니까 2부터 시작
		for(int i = 2; i <= num; i++) {
			//소수 판별을 위한 변수 
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if(j % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) { //소수인 경우 
				System.out.println(i + " ");
			}
	
		}

	}

}
