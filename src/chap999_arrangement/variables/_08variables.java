package chap999_arrangement.variables;

import java.util.Scanner;

public class _08variables {

	public static void main(String[] args) {
		// 사용자가 입력한 10개의 정수 중 소수의 개수를 출력
		//소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수
		//사용자가 입력할 수 있는 값은 2 ~ 30로 제한
		
		Scanner sc = new Scanner(System.in);
		
		//소수의 개수 저장하는 변수 
		int count = 0; 
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 정수를 입력하세요. (2~30 사이)"); 
			int num = sc.nextInt();
			
			if(num < 2 || num > 30) {
				System.out.println("2부터 30까지 입력하시라고~");
				i--; //다시 입력 받기 위해 감소시킴 
				continue;
			}
			//소수 판별을 위한 변수 
			boolean isPrime = true;
			
			for(int j = 2; j < num; j++) {
				//소수가 아닌 경우 
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
			//소수인 경우 
			if (isPrime) {
				count++;
			}
		} 
		
		System.out.println("입력한 10개의 정수 중 소수 개수 : " 
							+ count);
		
		sc.close();
	}
}
