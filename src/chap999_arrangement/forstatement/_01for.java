package chap999_arrangement.forstatement;

public class _01for {

	public static void main(String[] args) {
		// 1부터 10까지의 정수의 합을 출력
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1~10 합 : " + sum);

	}

}
