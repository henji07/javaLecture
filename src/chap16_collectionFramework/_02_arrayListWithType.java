package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import chap06_class.car.Car;

public class _02_arrayListWithType {

	public static void main(String[] args) {

		//타입 지정한 ArrayList 선언
		//선언부와 생성자 부분에 <>를 이용해서 타입을 지정
		ArrayList<String> strArrList = new ArrayList<String>();
		/*
		 * [
		 * 		new String("aaa"),
		 * 		new String("bbb"),
		 * 		new String("ccc")
		 * ]	
		 */
		
		// 클래스가 데이터 형식으로 리스트 안에 하나씩 들어감 
		// alt shift s => get toString 하면 정보 나옴 
		/* [ 
		 * 		{
		 * 				company: "현대",
		 * 				model: "아반떼"
		 * 				price: 3000
		 * 				메소드 
		 * 				...
		 *  	},
		 *  	{
		 * 
		 * 
		 * 		}
		 * 			...
		
		 * ] */
		
		//우리가 만든 Car클래스 import
		ArrayList<Car> carArrList = new ArrayList<Car>();
		
		Car car = new Car("현대", "아반떼", "검정", 3000);
		carArrList.add(car);
		
		Car car2 = new Car("기아", "k7", "검정", 4000);
		carArrList.add(car2);
		
		for(int i = 0; i < carArrList.size(); i++) {
			System.out.println(carArrList.get(i));
			carArrList.get(i).carInfo(); //메소드 바로 사용해도 됨 
		}
		
		
		//MapList는 위의 객체 ArrayList와 형태는 같다.
		//하지만 메소드는 추가할 수 없다. 
		ArrayList<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
		
		for(int i = 0; i < 10; i++) {
			Map<String, String> map = new HashMap<String, String>();
			
			//map이 하나 만들어진 거임
			map.put("company", "현대");
			map.put("model", "아반떼20" + (10 + i));
			map.put("price", "3000");
			
			//맵 10개 만들어진 거
			mapList.add(map);
			
		}
		
		for(int i = 0; i < mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}
		
		//다형성
		//인터페이스를 이용해서 다형성 구현도 가능
		List<String> list = new ArrayList<String>();
		list = new LinkedList<String>();
	}

}
