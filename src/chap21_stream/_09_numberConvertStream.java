package chap21_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _09_numberConvertStream {

	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.random() * 10) + 1;
		}
		
		IntStream intStream = Arrays.stream(intArr);
		
		intStream.asDoubleStream() 
		         .forEach(dNum -> System.out.println(dNum));
		
		
		//다시 사용하려면 다시 넣어줘야 함!
		intStream = Arrays.stream(intArr);
		intStream.boxed()
		         .forEach(iNum -> {
		        	 System.out.println(iNum.intValue());
		        	 System.out.println(iNum.getClass().getSimpleName());
		         });
	}
}
