package chap999_arrangement.loop;

import java.util.Scanner;

public class _03for {

	public static void main(String[] args) {
		// 사용자가 입력한 정수까지의 모든 소수를 출력
		
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//1은 소수가 아니니까 2부터 시작
		for(int i = 2; i <= num; i++) {
			//약수의 개수 세는 변수
			int cnt = 0; //cnt가 0이면 소수라고 생각
			//소수 판별을 위한 변수 
			for(int j = 2; j <= i; j++) {
				//나눠서 떨어지는지 검사 
				if(j % j == 0 && i != j) {
					cnt++; //소수가 아니면 카운트 올라가는 거
				}
			}
			if(cnt == 0) {
				System.out.println(i);
			}
		}

	}

}
