package chap10_abstraction;

import chap10_abstraction.academy.Academy;
import chap10_abstraction.academy.ComputerAcademy;
import chap10_abstraction.academy.EnglishAcademy;

public class _01_abstraction {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스화 불가
		//Academy ac = new Academy();
		
		//상속 받은 자식 클래스로 인스턴스화 가넝
		Academy ac = new EnglishAcademy();
		ac.teach();
		ac.homework();
		ac.rest();
		ac.attendance();
		
		System.out.println("--------------------");
		
		ac = new ComputerAcademy();
		ac.teach();
		ac.homework();
		ac.rest();
		ac.attendance();

	}
}
