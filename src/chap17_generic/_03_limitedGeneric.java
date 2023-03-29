package chap17_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class _03_limitedGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> lList = 
						new ArrayList<Long>();
		
		for(int i = 0; i < 10; i++) {
			lList.add((long)5 * i);
		}
		
		System.out.println(_03_limitedGeneric.
										<Long>sumList(lList));
		
		List<Number> numList = 
					new ArrayList<Number>();
		
		for(int i = 0; i < 10; i++) {
			numList.add((Integer)3 * i);
		}
		
		System.out.println(_03_limitedGeneric.max(numList));
		
		//맵 하나 만들어서 10개 넣게 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < 10; i++) {
			map.put(String.valueOf(i), Integer.valueOf((int)Math.random() * 100) + 1 );
			System.out.println(map.get(String.valueOf(i)));
		}
		//몇 번 키값에 최대값이 들어있는지 출력
		System.out.println(_03_limitedGeneric.maxKey(map));
	}

	
	//리스트를 받아서 리스트 요소의 합계를 리턴
	//Number를 상속 받은 클래스만 들어올 수 있도록 제한
	//메소드명은 sumList
	public static <T extends Number> double 
	sumList(List<T> tList) {
		double sum = 0.0;
		
		for(T t : tList) {
			sum += t.doubleValue();
		}
		
		return sum;
	}
	
	//와일드카드는 매개변수로만 사용가능하다.
	public static int 
	max(List<? super Integer> list) {
		int max = (int) list.get(0);
		
		for(int i = 1; i < list.size(); i++) {
			if((int)list.get(i) > max) {
				max = (int)list.get(i);
			}
		}
		
		return max;
	}
	
	public static <K, V extends Number> 
	int sumMapValue(Map<K, V> map) {
		int sum = 0;
		
		//map에 values꺼내면 collection으로 나옴 
		//향상된 for문
		for(V v : map.values()) {
			sum += (int)v;
		}
		
		return sum;
	}
	
	//Map의 value의 맥스값을 찾고 해당 키값을 리턴하는 메소드
	//키 - 값 조합의 타입
	//넘버 상속 받은 애들만
	public static <K, V extends Number> K maxKey(Map<K, V> map) {
		//map의 형태
		/*
		 * {
		 * 		"a" : 1,
		 * 		"b" : 2,
		 * 		"c" : 3
		 * 			...
		 * }
		 * 
		 * 여기서 하나의 Entry 꺼내면 
		 *  Set<Entry<K, V>> 이 형태
		 * 					"a" : 1
		 * 
		 *  map.entrySet()
		 *  => {
		 *  		{a : 1},
		 *  		{b : 2},
		 *  		{c : 3}
		 *  
		 *  
		 *
		 *  }
		 * 
		 * */
		K maxkey = null; //키 리턴
		V maxval = null; //값 리턴
		
		int index = 0; 
		for(Entry<K, V> ent : map.entrySet()) {
			//처음에 들어오면 비교할 값 없으니까 
			//인덱스 0이면 바로 넣어줌 
			if(index == 0) {
				maxkey = ent.getKey();
				maxval = ent.getValue();
				//두 번째부터 else문 
			} else {
				if(ent.getValue().doubleValue() > maxval.doubleValue()) {
					maxkey = ent.getKey();
					maxval = ent.getValue();
				}
				
			}
	
			index++;
		}
		//for문 다 돌면 마지막에 남아있는 maxkey리턴
		return maxkey;
	}
	
	public int add(List<?> inList) {
		return 1;
	}
	
	
	
	
	
	
	
}
