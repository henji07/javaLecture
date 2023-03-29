package chap98_homework.nc230328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import chap98_homework.nc230328.clazz.Calculator;

public class _02_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(10, 20);
		map.put(100, 200);
		map.put(10000, 2);
		map.put(1000, 2009);
		map.put(100, 20000);
		
		System.out.println(getMaxMul(map));
		
		map.clear();
		
		for(int i = 0; i < 5; i++) {
			map.put(i, i);
		}
		printKVDesc(map);
		
		Calculator<Double> calc = new Calculator<Double>(15.13, 11.99);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
	}
//	1. key와 value 모두 Number를 상속받은 클래스의 타입을 가지고 key, value의 곱이 가장 큰
//    Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
	public static <K extends Number, V extends Number> Entry<K, V> getMaxMul(Map<K, V> map) {
		//입력 맵의 최대 곱을 가지는 Entry객체 찾아 변환하는 정적 메소드
		//K와 V는 Number 클래스나 Number 클래스의 하위 클래스만 받을 수 있음을 
		//제네릭 타입 매개변수에서 선언
		Entry<K, V> maxEntry = null;
		
		Number num = null; //Entry 객체의 키와 값의 곱의 결과값을 담을 변수를 초기화
		
		int index = 0; //맵의 Entry객체에 순서를 부여하기 위한 인덱스 변수 초기화
		
		//입력 맵의 모든 Entry 객체에 대한 반복 
		for(Entry<K, V> ent : map.entrySet()) {
			//첫 번째 Entry 객체일 경우 
			if(index == 0) {
				//첫 번째 Entry객체의 키와 값의 곱으로 초기화
				num = ent.getKey().doubleValue() * ent.getValue().doubleValue();
				maxEntry = ent;
			} else {
				//이전까지 계산한 곱보다 현재 Entry 객체의 키와 값의 곱이 더 큰 경우
				if(num.doubleValue() < ent.getKey().doubleValue() * ent.getValue().doubleValue()) {
					//현재 Entry 객체의 키와 값의 곱으로 최대 곱을 담을 변수를 갱신
					num = ent.getKey().doubleValue() * ent.getValue().doubleValue();
					//현재 Entry 객체로 최대 곱을 가지는 Entry 객체를 갱신
					maxEntry = ent;
				}
			}
			
			index++; //인덱스를 증가시켜 맵의 다음 Entry 객체에 순서를 부여
		}
		
		return maxEntry; //최대 곱을 가지는 Entry 객체를 반환
	}
	
//	2. Map을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 제네릭 메소드를
//	   구현하세요.
	public static <K, V> void printKVDesc(Map<K, V> map) {
		// 입력 맵의 키-값 쌍을 키를 기준으로 내림차순으로 출력하는 정적 메소드
		List<Entry<K, V>> entList = new ArrayList<Entry<K, V>>();// 맵의 Entry 객체를 저장할 리스트 생성
		
		// 입력 맵의 모든 Entry 객체를 리스트에 추가
		for(Entry<K, V> ent : map.entrySet()) {
			entList.add(ent);
		}
		
		// 리스트의 크기만큼 반복하며 역순으로 키-값 쌍 출력
		for(int i = 0; i < entList.size(); i++) {
			System.out.println(entList.get(i).getKey() 
					+ " : " + entList.get(entList.size() - (i + 1)).getValue());
		}
		// 리스트의 첫 번째 요소부터 마지막 요소까지 순서대로 키를 가져오면서, 
		// 역순으로 키에 해당하는 값을 가져와 출력
		// 출력 예시: "key1 : value3"
	}
}
