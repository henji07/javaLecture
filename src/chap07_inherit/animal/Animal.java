package chap07_inherit.animal;

public class Animal {
	//속성
	public static int age;
	public int size;
	public int legCnt;
	public boolean hasWing;

	//생성자
	public Animal () {
		
	}
	
	//생성자
	public Animal(int age, int size, int legCnt, boolean hasWint) {
		this.age = age;
		this.size = size;
		this.legCnt = legCnt;
		this.hasWing = hasWing;
	}
	
	//static 키워드로 클래스 메소드 선언
	public static void agePrint() {
		System.out.println(age + "살!");
		}
	
	//메서드
	public void eat() {
		System.out.println("식사를 한다.");
	}
	
	public void sizeInt() {
		System.out.println("몸무게 : " + size + "kg");
	}
	
}
