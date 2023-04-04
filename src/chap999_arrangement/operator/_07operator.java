package chap999_arrangement.operator;

import java.util.Scanner;

public class _07operator {

	public static void main(String[] args) {
		// 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력
		
		System.out.println("실수 2개를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double add = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + add);
		
		double sub = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + sub);
		
		double div = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + div);
		
		double mul = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + mul);
		
		double rem = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + rem);
		
		sc.close();
	}
}
