package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class _01_arrayList {

	public static void main(String[] args) {
		
		//타입 지정 안 해서 노란 줄 뜨는 거~
		//타입 지정하지 않으면 자동적으로 Object가 지정
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		//데이터 추가(add) 
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(5);
		list1.add(4);
		
		//subList : 지정한 인덱스 사이의 데이터를 잘라옴 
		list2 = new ArrayList(list1.subList(2, 5));
		
		//print(println, printf, print...)의 매개변수로 객체를 넣게되면 자동으로 
		//toString() 메소드가 실행된 결과가 출력된다. 
		System.out.println(list1); //list1.toString인 거임
		System.out.println(list2);
		System.out.println("-----------------------------------");
		
		//정렬 
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1); 
		System.out.println(list2);
		System.out.println("-----------------------------------");
		
		
		//containsAll 포함여부 확인 
		if(list1.containsAll(list2)) {
			System.out.println("list1이 list2를 포함합니다.");
		} else {
			System.out.println("list1이 list1를 포함하지 않습니다.");
		}
		System.out.println("-----------------------------------");
		
		//list2 데이터 추가
		//int값 들어가 있어도 어차피 Object니까 String값 들어가도 됨
		list2.add("collection");
		list2.add("framework");
		System.out.println(list2);
		
		//set : 위치에 있는 데이터 바꿈 
		list2.set(3, "List");
		System.out.println(list2);
		System.out.println("-----------------------------------");
		
		//list1에 list2의 데이터만 남기고 나머지는 삭제 
		list1.retainAll(list2);
		System.out.println(list1);
		
		//ArrayList의 복제
		//clone()이 Object타입 리턴하기 때문에 형변환 필수 
		ArrayList list3 = (ArrayList)list2.clone(); 
		
		//깊은 복제인지 얕은 복제인지 
		//같은 객체를 바라보는지 
		System.out.println(list2 == list3);
		System.out.println(list2.equals(list3));
		System.out.println("-----------------------------------");
		
		//크기 10짜리 
		ArrayList list4 = new ArrayList();
		
		list4.add(0, 10);
		
		//capacity 확인하는 메서드 없음
		System.out.println(list4.size());	
	
		list4.trimToSize(); //빈공간 삭제 메소드 
		
		
		String[] strArr = new String[list2.size()];
		//Type을 지정 안 했을 때의 문제점
		//형 변환시 castException이 발생할 수도 있다. 
		//Type을 지정해서 공통된 타입의 데이터만 다룰 수 있도록 한다. 
		for(int i = 0; i < list2.size(); i++) {
			String str =  (String) list2.get(i); 
			strArr[i] = str;
			
			//String str = new String(list2.get(i)); 
			//list2.get(i)가 object형태라서 바로 안 나오고 .toString으로 바꿔줘야 함 
		}
	
	}

}
