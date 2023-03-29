package chap08_static.clazz;

public class Weight {
	
	public void twoWeightSum() {
		int a = 76;
		int b = 65;
		
		//계속 사용될 변수나 
		//공통적으로 많이 쓰이는 메소드들 static으로 
		String sum = Add.add(a, b, "kg");
		System.out.println(sum);
		
		sum = Add.add(a, b, "g");
	}
		
		public void twoWeightGramSum() {
			int a = 76;
			int b = 65;
			
			//공통적으로 많이 쓰이는 것은 static으로 
			String sum = Add.add(a * 1000, b * 1000, "g");
			System.out.println(sum);
	}
}
