package chap999_arrangement.variables;

public class _03variables {

	public static void main(String[] args) {
		// 반지름이 20인 원의 넓이와 둘레를 출력
		// (넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
		// 단, 원주율 3.14는 상수로 선언
		
		int r = 20;
		double s = 2 * Math.PI * r * r;
		double d = 4 * Math.PI * r;
		
		System.out.println("넓이: " + s + ", 둘레 : " + d);

	}

}
