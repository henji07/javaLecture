package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {

	public static void main(String[] args) {
		//
		//Set<String> strSet = new Set<String>();
		//인터페이스는 인스턴스화가 안돼서 이렇게 못씀
		//상속 받은 자식으로 선언해야 함
		
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("Javascript");
		strSet.add("Html/Css");
		
		//중복 값 저장
		//순서 무작위로 들어감
		strSet.add("JDBC");
		strSet.add("Java");
		strSet.add("React.js");
		
		System.out.println("strSet의 크기 : " + strSet.size());
		
		//Iterator 써서 꺼낼 때도 무작위로 꺼내짐
		int idx = 0; 
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			String str = it.next(); 
			//다음 요소가 있으면 다음 요소 꺼내서 담아주도록
			
			System.out.println(idx++ + " : " + str); 
			//인덱스에 어떤 string이 들어가 있는지
			
			if(str.equals("Html/Css")) {
				System.out.println(idx++ + " : " + str);
			}
		}
		
		//요소 삭제 
		strSet.remove("JDBC");
		System.out.println("strSet의 크기 : " + strSet.size());
		
		//비어 있는지
		strSet.clear();
		if(strSet.isEmpty()) {
			System.out.println("strSet은 비어 있습니다.");
		} else {
			System.out.println("strSet은 비어있지 있습니다.");
		}

	}

}
