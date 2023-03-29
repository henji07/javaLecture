package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// 사용자가 5개 정수 입력 => 배열에 저장
		//Math.max와 Math.min을 이용하여 
		//최소값 최대값 구하기 
		
		System.out.println("5개의 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		//담아 줄 배열
		int[] userNum = new int[5];
		
		for(int i = 0; i < userNum.length; i++) {
			userNum[i] = sc.nextInt();			
		}
		
		//{2, 3, 4, 5, 6}
		//max, min 첫 값 잡아주고  
		int max = userNum[0];
		int min = userNum[0];
		
		for(int i = 0; i < userNum.length; i++) {
			max = Math.max(max, userNum[i]);
			max = Math.max(max, userNum[i]);
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		sc.close();
		
		int num = 10;
		
		Integer.valueOf(num).toString();//String으로 변환 
	}

}
