package chap21_stream;

import java.util.Arrays;

public class _14_mathMethod {

	public static void main(String[] args) {
		
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//개수
		long cnt = Arrays.stream(intArr)
					     .count();
		System.out.println("요소의 개수 : " + cnt);
		
		//첫 번째 요소
		int first = Arrays.stream(intArr)
					 	  .findFirst().getAsInt();
		System.out.println("첫 번째 요소 : " + first);
		
		//최대 최소값
		int max = Arrays.stream(intArr)
						.max().getAsInt();
		
		int min = Arrays.stream(intArr)
						.min().getAsInt(); 

		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		//합계 평균 
		int sum = Arrays.stream(intArr)
						.filter(i -> i % 2 == 0) //조건 줄 수도 있음 
					    .sum();
		
		double avg = Arrays.stream(intArr)
					       .average().getAsDouble();
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
	}
}
