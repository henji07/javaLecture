package chap20_lambda.clazz.exam09;

import java.util.Scanner;

public class _10_lambdeEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num2 = sc.nextInt();
		sc.nextLine(); //String으로 받은 다음 
		System.out.println("연산자(+ - * /)를 입력하세요.");
		char operator = sc.nextLine().charAt(0); //하나씩 빼주기
		
		FourOpCalc foc = new FourOpCalc();
		
		int result = foc.calc(num1, num2, operator, (a, b) -> {
			//구현체 
			
			int returnNum = 0;
			
			switch(operator) {
			case '+' :
				returnNum = num1 + num2;
				break;
			case '-' :
				returnNum = num1 - num2;
				break;
			case '*' :
				returnNum = num1 * num2;
				break;
			case '/' :
				returnNum = num1 / num2;
				break;
			default : 
				returnNum = -999;
				break;
			}
			return returnNum;
			//리턴 무조건 해줘야 함
		});
		System.out.println(result);
		sc.close();

	}

}
