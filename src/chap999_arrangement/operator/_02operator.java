package chap999_arrangement.operator;

public class _02operator {

	public static void main(String[] args) {
		//int형 변수 20을 증감연산자를 사용해서 
		//다음과 같은 순서로 출력되도록 구현하세요. 
		//21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
		
		int a = 20;
		
		System.out.println(++a); //a = 21, 출력 = 21
		
		System.out.println(++a); //a = 22, 출력 = 22
		System.out.println(a); //a = 22, 출력 = 22
		System.out.println(a--); //a = 21, 출력 = 22
		
		System.out.println(--a); //a = 20, 출력 = 20
		System.out.println(a--); //a = 19, 출력 = 20
		
		System.out.println(a++); //a = 20, 출력 = 19 
		System.out.println("마지막 a : " + a); // 
	}

}
