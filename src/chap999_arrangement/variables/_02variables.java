package chap999_arrangement.variables;

import java.util.Scanner;

public class _02variables {

	public static void main(String[] args) {
		//사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 
				//두 정수로 해당 연산을 진행한 결과를 출력
				Scanner sc2 = new Scanner(System.in);
			
				System.out.print("첫 번째 정수 입력 : ");
				int num1 = sc2.nextInt();
				
				System.out.print("두 번째 정수 입력 : ");
				int num2 = sc2.nextInt();
				
				System.out.print("연산자 입력(+, -, *, /) : ");
				//next는 String형태 받는 거
				//입력받은 연산자 문자로 읽은 후 
				//charAt(0) 사용해서 첫 번째 문자 추출 
				char op = sc2.next().charAt(0);
				
				//결과값 저장할 수 있는 변수 초기화 
				int result = 0;
				
				switch(op) {
					case '+' :
						result = num1 + num2;
						break;
					case '-' :
						result = num1 - num2;
						break;
					case '*' :
						result = num1 * num2;
						break;
					case '/' :
						result = num1 / num2;
						break;
				}
				System.out.println(num1 + " " +  op + " " + num2 + 
									" = " + result);
				sc2.close();
			}
	}


