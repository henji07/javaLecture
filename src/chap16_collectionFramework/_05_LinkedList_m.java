package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _05_LinkedList_m {

	public static void main(String[] args) {
		// ArrarList와 LinkedList 속도 비교 
		
		//순차적 데이터 넣기 비교
		List<String> aList = new ArrayList<String>();
		List<String> lList = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//현재 시간 long으로 변경
		startTime = System.nanoTime();
		
		for(int i = 0; i < 1000000; i++) {
			aList.add(String.valueOf(i));
		}
		
		//끝났을 때 날짜 정보 long타입으로
		endTime = System.nanoTime();
		System.out.println("ArrayList에 순차적으로 데이터를 " + 
								"추가하는 데 걸린시간 : " + 
								(endTime - startTime) + "나노초입니다.");
		
		//현재 시간 long으로 변경
		//contains메소드 속도 비교 
				startTime = System.nanoTime();
				
				for(int i = 0; i < 1000000; i++) {
					lList.add(String.valueOf(i));
				}
				
				//끝났을 때 날짜 정보 long타입으로
				endTime = System.nanoTime();
				System.out.println("LinkedList에 순차적으로 데이터를 " + 
										"추가하는 데 걸린시간 : " + 
										(endTime - startTime) + "나노초입니다.");


	}

}
