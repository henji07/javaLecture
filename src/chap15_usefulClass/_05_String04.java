package chap15_usefulClass;

import java.util.Scanner;

public class _05_String04 {

	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str.replace("노래", "구만")
								.replace("아주멀리", "구만")
								.replace("너에게로", "구만"));
		
		sc.close();
	}
}
