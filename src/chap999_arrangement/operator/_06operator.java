package chap999_arrangement.operator;

import java.util.Scanner;

public class _06operator {

	public static void main(String[] args) {
		// 삼항연산자의 중첩을 이용하여 
		//사용자가 입력한 정수가 100보다 크면 "100보다 큼" 
		//작으면 "100보다 작음" 같으면 "100"을 출력하세요.

		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	
		String result;
		
		result = (input == 100) ? "100" :(input > 100 ? "100보다 큼" : "100보다 작음");
		
		System.out.println(result);
		
	
		

	}

}
