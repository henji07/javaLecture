package chap999_arrangement.operator;

import java.util.Scanner;

public class _01operator {

	public static void main(String[] args) {
		//사용자가 입력한 두 정수 
		//덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력
		//메인메소드에서 구현
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개 입력하세용");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + add);
		
		int sub = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + sub);
		
		int div = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + div);
		
		int mul = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + mul);
		
		int rem = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + rem);
		

	}

}
