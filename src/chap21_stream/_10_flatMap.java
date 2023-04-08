package chap21_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class _10_flatMap {

	public static void main(String[] args) {
		// {{1, 2}, {3, 4}, {5, 6}}
		//Stream<int[]>
		//Stream<Stream> .flatMap => Stream<Integer>
		
		int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};
		
		Arrays.stream(intArr)
			  .flatMapToInt(Arrays :: stream) //= (arr -> Arrays.stream(arr))
			  /*.map(num -> num * 3) 옵션 */
			  .forEach(num -> System.out.println(num));

		//하나의 스트림으로 받아서 처리 
		
	}

}
