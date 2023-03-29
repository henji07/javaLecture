package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//	    4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		Map<String, Integer> stMap = new HashMap<String, Integer>();
		stMap.put("김구만", 100);
		stMap.put("전해정", 90);
		stMap.put("윤후", 80);
		stMap.put("동수", 70);
		
		Set<Entry<String, Integer>> entrySet = stMap.entrySet();
		System.out.println(stMap);
		
		//Entry 키 - 값 한 쌍 꺼내오는 거 
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		System.out.println(entrySet);
		
		String name = "";
		int score = 0;
		int cnt = 0;
		
		while(it.hasNext()) {
			Entry<String, Integer> ent = 
										it.next();
			if(cnt > 0) {
				if(ent.getValue() > score) {
					score = ent.getValue();
					name = ent.getKey();
				}
			} else {
				score = ent.getValue();
				name = ent.getKey();
			}
			
			cnt++;
		}
		
		System.out.println(name + " : " + score);

//	    2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 
//	    Map<String, Integer>에 담은 후 출력하세요. 
//	    ex) {"3" : 1({1, 2}), "4" : 1({1, 3}, "5" : 2({1, 4}, {2, 3})
		
		//정수 배열 선언 및 초기화
		int[] intArr = {1, 2, 3, 4, 5};
		
		//더해준 값을 담아줄 리스트 
		List<Integer> intList = new ArrayList<Integer>();
		
		//출력할 Map
		Map<String, Integer> sumMap = new HashMap<String, Integer>();
		
		//정수 배열 intArr의 두 수를 더한 값을
		//리스트 intList에 추가하는 이중 for문
		for(int i = 0; i < intArr.length; i++) {
			for(int j = i + 1; j < intArr.length; j++) {
				if(j != i) {
					intList.add(intArr[i] + intArr[j]);
				}
			}
		}
		//리스트 intList에 저장된 값을 출력하는 부분
		System.out.println(intList);
		System.out.println();
		
		// 리스트 intList에 저장된 각 값이 몇 번 등장하는지 카운트하고, 
		//그 결과를 맵 sumMap에 저장하는 부분 
		for(int i = 0; i < intList.size(); i++) {
			// 각 값을 카운트할 변수를 1로 초기화 
			int sumCnt = 1;
			
			//리스트 intList에서 현재 값을 제외한 나머지 값들과 비교하여 
			//같은 값을 가진 개수를 카운트하는 이중 for문
			for(int j = 0; j < intList.size(); j++) {
				if(i != j) {// 현재 값과 같은 인덱스인 경우는 제외
					if(intList.get(i) == intList.get(j)) {
						// 현재 값과 같은 값을 가진 경우 
						System.out.println(intList.get(i));
						sumCnt++;  // 카운트 증가
					} 
				}
			}
			 // 카운트 결과를 맵 sumMap에 저장 
			if(sumCnt > 0)
				sumMap.put(String.valueOf(intList.get(i)), sumCnt);
		}
		System.out.println();
		System.out.println(sumMap);
//		3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.
	}

}
