package chap15_usefulClass;

public class _12_boxing {

	public static void main(String[] args) {
		
		int num1 = 100;
		
		//원시타입을 객체로 만들어줌 = 박싱
		//박싱이 일어나는 부분 -> (Integer)num1;
		Integer objNum1 = (Integer)num1;
		
		//컴파일러가 객체를 원시타입으로 변환
		//자동 언박싱 
		//num1 + objNum1; -> 이 부분
		int num2 = num1 + objNum1;
		
		Integer objNum2 = Integer.valueOf(300);
		
		//          언박싱
		//          객체를 원시타입으로 변환 
		int num3 = (int)objNum2;
		
		//                원시타입이 Integer로 넘어가게 되니까
		//				  자동으로 박싱이 일어남 
		//				  컴파일러가 자동으로 원시타입을 객체로 만듦
		Integer objNum3 = objNum2 + num3;

		//수동박싱
		System.out.println("수동박싱 : " + objNum1); 
		
		//Int = Integer + Int
		//자동 언박싱
		System.out.println("자동언박싱 : " + num2);
		
		//수동언박싱 
		System.out.println("수동언박싱 : " + num3);
		
		//자동박싱
		System.out.println("자동박싱 : " + objNum3);
		
		

	}

}
