package chap21_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _11_sorted {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 5; i++) {
			intList.add(i);
		}
		
		intList.stream()
			   .sorted()//오름차순으로 정렬 
			   .sorted(Comparator.reverseOrder()) 
			           //collection으로 바꾼 다음 역방향 정렬
			   .forEach(num -> System.out.println(num));	
	}
}
