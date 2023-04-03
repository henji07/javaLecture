package chap999_arrangement.loop;

public class _02for {

	public static void main(String[] args) {
		// 2의 거듭제곱을 10회동안 반복하며 출력하세요.
		//(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		
		int result =2;
		
		for(int i = 1; i < 10; i++) {
			System.out.print("2");
			result *= 2;
			
			for(int j = 1; j < i; j++) {
				System.out.print("*2");
			}
			System.out.println(" = " + result);
		}
		
	}

}
