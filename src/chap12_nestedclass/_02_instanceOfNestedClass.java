package chap12_nestedclass;

import chap12_nestedclass.clazz.NestedClass;

public class _02_instanceOfNestedClass {

	public static void main(String[] args) {
		//외부클래스 객체 생성 mul에 접근하기 위해 
		NestedClass nc = new NestedClass();
		//nc에 담겨있는 객체를 이용해서 생성자를 호출 
		
		//1. 인스턴스 중첩 클래스의 객체 생성
		NestedClass.Mul mul = nc.new Mul();
		//멤버 호출하듯이 생성자도 .찍고 호출하는 거
		
		//2. 정적 중첩 클래스의 객체 생성
		NestedClass.Div div = new NestedClass.Div();
		//메모리에 올라가 있기 때문에 바로 사용 가능
		
		//3-1. 정적 중첩 클래스의 정적 멤버에 접근 
		System.out.println(NestedClass.Div.result);
		//스태틱 아닌 일반 변수, 메서드들에게는 객체 만들어서 접근해야 함 
		
		//3-2. 정적 중첩 클래스의 일반 멤버에 접근 
		System.out.println(div.getNum3());
		
		//4. 인스턴스 중첩 클래스의 객체 사용
		mul.setNum1(150);
		mul.setNum2(15);
		mul.setResult(mul.getNum1() * mul.getNum2());
		System.out.println(mul.getResult());
	}
 }

