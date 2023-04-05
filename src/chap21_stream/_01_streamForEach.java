package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _01_streamForEach {

	static int sum = 0;
	
	public static void main(String[] args) {
		// 
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
			System.out.println(intList.get(i));
		}

		
		
		//스트림 꺼내서 받아서 스트림으로 사용
		Stream<Integer> intStream = intList.stream();
		
		intStream.forEach(num -> sum += num);
		
		System.out.println("총합 : " + sum);
	}

}
