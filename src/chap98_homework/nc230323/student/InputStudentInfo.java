package chap98_homework.nc230323.student;

import java.util.Scanner;

public class InputStudentInfo {
	//입력모드 선택 메소드(기본정보, 과목정보)
	public void printInpuMode(Scanner sc, Student[] stArr) {
		while(true) { //1번 누르면 이거 
			System.out.println("------학생정보 입력------");
			System.out.println("1. 기본정보 입력");
			System.out.println("2. 과목정보 입력");
			
			int selMode = sc.nextInt();
			boolean finWhile = false;
			
			switch(selMode) {
				case 1:
					//기본정보 입력 메소드 호출 
					inputDefaultInfo(sc, stArr);
					finWhile = true;
					break;
				case 2:
					//과목정보 입력 객체 
					InputSubject ipSub = new InputSubject();
					//과목정보 입력 객체의 과목 정보 입력 메소드 호출 
					ipSub.inputSubjectInfo(sc, stArr);
					finWhile = true;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue;
			}
			
			if(finWhile) {
				break;
			}
		}
	}
	
	//기본정보 입력 메소드 
	public void inputDefaultInfo(Scanner sc, Student[] stArr) {
		System.out.println("------기본정보 입력------");
		System.out.print("학번 : ");
		int sno = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		StringBuffer name = new StringBuffer(sc.nextLine());
		while(true) {
			System.out.print("학과 : ");
			String subject = sc.nextLine();
			
			if(subject.equals("수학")) {
				stArr[sno - 1] = new MathStudent(sno, name);
				break;
			} else if(subject.equals("영어")) {
				stArr[sno - 1] = new EngStudent(sno, name);
				break;
			} else if(subject.equals("컴공")) {
				stArr[sno - 1] = new ComStudent(sno, name);
				break;
			} else {
				System.out.println("없는 학과입니다.");
				continue;
			}
		}
	}
}
