package chap15_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {
		
		double num = 123.45678;
		
		//올림, 반올림, 버림 
		System.out.println(Math.ceil(num));
		System.out.println((double)Math.round(num));
		System.out.println(Math.floor(num));
		
		//소수점 둘째자리까지
		System.out.println((double)Math.round (num * 100) / 100);
		//round는 double 안 붙이면 정수형으로 나옴...?
		System.out.println(Math.round (num * 100) / 100);
		
		//소수점 셋째
		System.out.println((double)Math.round (num * 1000) / 1000);
		
		//floor(), ceil()은 double 안 붙여도 됨여
		System.out.println(Math.ceil (num * 100) / 100);
		System.out.println(Math.floor (num * 100) / 100);
	}

}
