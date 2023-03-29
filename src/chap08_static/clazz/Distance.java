package chap08_static.clazz;

public class Distance {
	
	public void distanceSum() {
		int a = 5;
		int b = 10;	
	
		//공통적으로 많이 쓰이는 것은 static으로 
		String sum = Add.add(a, b, "km");
		System.out.println(sum);
	}
}
