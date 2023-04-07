package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_arrayToString {

	public static void main(String[] args) {
		// 
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1; //1~10 랜덤값 10개
			System.out.print(intArr[i] + " ");
		}
		
							//IntStream.of(intArr);
		IntStream intStream = Arrays.stream(intArr);
							
		//5이상인 값들만 스트림으로 만들기 
		IntStream fiveStream = intStream.filter(f -> f >= 5);
				
		
		//5이상인 값들에 *4해서 새로운 스트림 만들기 
		IntStream fourStream = fiveStream.map(f -> f * 4); 
		//한 줄이면 이게 바로 리턴
		
		/* 두 줄 이상이면 중괄호로 묶고 ; 다 찍어줘야 함 
		fiveStream.map(num -> {
			int result = 0;
			result = num * 4;
			return result; //리턴문도 꼭!!
		});
		*/
		System.out.println();
		//출력
		//forEach void형태, 받아주는 변수 있으면 안됨!
		fourStream.forEach(f -> System.out.print(f + " "));
		
		//체이닝 기법
		Arrays.stream(intArr)
			  .filter(num -> num >= 5)
			  .map(num -> num * 4)
			  .forEach(num -> System.out.print(num + " "));

	}

}
