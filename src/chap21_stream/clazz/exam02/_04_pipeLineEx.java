package chap21_stream.clazz.exam02;

import java.util.ArrayList;
import java.util.List;

public class _04_pipeLineEx {

	public static void main(String[] args) {
		//
		List<CreditCard> cardList = new ArrayList<CreditCard>();
		
		/* 스트림으로 한도가 5000만원 이상인 카드 이름과 회사 출력
		 * 카카오, 라이언카드, 한도 1000
		 * 삼성카드, 탭탭카드, 2000
		 * 신한카드, 드림카드, 3000
		 * 삼성카드, ID카드, 5000
		 * 현대카드, 더블랙, 100000
		 * 아멕스, 블랙카드, 300000
		 */
		
		cardList.add(new CreditCard("카카오", "라이언카드", 1000));
		cardList.add(new CreditCard("삼성카드", "탭탭카드", 2000));
		cardList.add(new CreditCard("신한카드", "드림카드", 3000));
		cardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		cardList.add(new CreditCard("현대카드", "더블랙", 100000));
		cardList.add(new CreditCard("아멕스", "블랙카드", 300000));
		
		/* 방법 1.
		//CreditCard를 스트림 형태로 
		//신용카드 리스트에서 스트림 얻기
		Stream<CreditCard> cardStream = cardList.stream();
		
		//조건
		//한도 5000이상인 애들만 남는 거 
		Stream<CreditCard> limitStream = cardStream.filter(card -> card.getLimitMoney() >= 5000);
		
		//최종
		limitStream.forEach(theCard -> System.out.println(theCard.getCompany() + " : " + theCard.getCardName()));
		*/
		
		
		/* 방법 2.*/
		cardList.stream() //creditCard 객체 여러 개가 저장된 스트림 
				//List<CreditCard>에서 Stream<CreditCard>로 만들어준 거임
		
				//card에 CreditCard 객체가 하나씩 들어가는 거
				//조건에 안 맞으면 안 남김
				.filter(card -> card.getLimitMoney() >= 5000)
				//Stream<CreditCard> 형태로 남아있는 애들 = [{삼성, id, 5000}, {현대, 더블랙, 10000}, {아멕스, 블랙, 30000}]
				
				//한 요소씩 순회하는 forEach
				//실행 코드 
				.forEach(c -> System.out.println(c.getCompany() + " : " + c.getCardName()));
		
		//map() : 새로운 스트림 만들어서 리턴
		//실행코드의 결과값으로 새로운 스트림 생성 
		cardList.stream()
				.map(c -> {
					c.setCompany("삼성카드");
					c.setLimitMoney(c.getLimitMoney() + 3000);
				return c;
				})
				.forEach(card -> System.out.println(card.toString()));
		
		//reduce
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i <= 30; i++) {
			intList.add(i);
		}
		
		int sum = intList.stream()
				
						//리턴된 값이 다시 result에 담김 
						//다음에 올 때는 합쳐진 값이 오는 거
						 .reduce((result, num) -> result + num) 
						 .get(); //get으로 결과값 출력하는 거 
		
		System.out.println(sum);

	}

}
