package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import chap06_class.car.Car;

public class _07_literator_m {

	public static void main(String[] args) {
		
		//Map - Collection을 상속 받지 않아, 
		//      literator를 사용할 수 없지만 set을 이용해서 쓸 수 있음
		
		List<Car> cList = new ArrayList<Car>();
		
		//타입이 car니까 cList에 담을 수 있음
		Car car = new Car("현대", "제네시스", "은색", 5000); 
		cList.add(car);

		
		car = new Car("현대", "아반떼", "흰색", 3000); 
		cList.add(car);
		
		
		car = new Car("현대", "소나타", "검정색", 4000); 
		cList.add(car);
	
		
		car = new Car("기아", "ev6", "파란색",4000); 
		cList.add(car);
	
		
		car = new Car("기아", "모하비", "빨간색", 5000); 
		cList.add(car);
		
		//삭제되기 전
		System.out.println(cList.size());
		
		System.out.println("----------------------------------");
		
		//Iterator로 요소들 받아오기
		Iterator<Car> it = cList.iterator();
		
		
		//다음 요소 꺼내서 Car 형태로 바꿔준 다음 
		//c에 담고 그것에 대한 정보 출력하도록
		while(it.hasNext()) {
			Car c = (Car)it.next();
			c.carInfo();
			//company가 현대면 출력하고 삭제되도록
			if(c.company.equals("현대"))
				it.remove();
		}
		
		//삭제된 후 
		System.out.println(cList.size());
		
		System.out.println("----------------------------------");
		
		ListIterator<Car> lit = cList.listIterator();
		lit.next();
		
		while(lit.hasPrevious()) {
				lit.previous();
		//hasnext랑 previous랑 충돌하니까 같이 쓰면 안 됨 
				Car c = 
						new Car("쉐보레", "카마로", "노란색", 4000);
				//가져온 이전 요소에다 c를 "쉐보레", "카마로", "노란색"로 바꾸는 
				
				lit.set(c);
		}
		
		for(Car c : cList) {
			c.carInfo();
		}
	}

}
