package chap98_homework.nc230321;

import java.util.Scanner;

import chap98_homework.nc230321.employee.ContractEmployee;
import chap98_homework.nc230321.employee.Employee;
import chap98_homework.nc230321.employee.RegularEmployee;
import chap98_homework.nc230321.employee.TempEmployee;

public class _03_advance {

	public static void main(String[] args) {
		
		Employee[] ep = new Employee[100];
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;
		String name = "";
		int pay = 0;
		int bonus = 0;
		int hireYear = 0;
		int workDay = 0;
		
		while(true) { 
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			//사용자 입력 받아 변수 input에 저장 
			int input = sc.nextInt();
			//사용자가 입력한 번호에 따라 
			//해당 기능을 수행하는 switch문 실행
			switch(input) {
				case 1 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("보너스를 입력하세요.");
					bonus = sc.nextInt();
					//사번, 이름, 급여, 보너스 입력받아
					//RegularEmployee클래스 객체 생성하고 배열에 저장
					ep[eno] = new RegularEmployee(eno, name, pay, bonus);
					ep[eno].showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 2 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("근무년수를 입력하세요.");
					hireYear = sc.nextInt();
					//사번, 이름, 급여, 근무년수 입력받아
					//TempEmployee 클래스 객체 생성하고 배열에 저장 
					ep[eno] = new TempEmployee(eno, name, pay, hireYear);
					ep[eno].showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 3 : 
					System.out.print("사번을 입력하세요.");
					eno = sc.nextInt();
					sc.nextLine();
					System.out.print("이름을 입력하세요.");
					name = sc.next();
					sc.nextLine();
					System.out.println("급여를 입력하세요.");
					pay = sc.nextInt();
					System.out.println("근무일수를 입력하세요.");
					workDay = sc.nextInt();
					//사번, 이름, 급여, 근무일수 입력 받아
					//ContractEmployee 클래스 객체 생성하고 배열에 저장
					ep[eno] = new ContractEmployee(eno, name, pay, hireYear);
					ep[eno].showEmployeeInfo();
					System.out.println("----------------");
					break;
				case 4 : 
					for(int i = 0; i < ep.length; i++) {
						if(ep[i] != null) {
							ep[i].showEmployeeInfo();
							//배열에 저장된 모든 직원 정보 출력 
							System.out.println("----------------");
						}
					}
					break;
				case 5 : 
					System.out.print("검색할 사원의 사번을 입력하세요.");
					eno = sc.nextInt();
					ep[eno].showEmployeeInfo();
					//검색할 사원의 사번 입력 받아 
					//해당 직원의 월급 계산하여 출력
					System.out.println("----------------");
					break;
				case 6 : 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					//프로그램 자체 종료 
				default : 
					System.out.println("잘못 입력하셨습니다.");
					continue;
					//잘못 입력 받았을 때 무한 루프 돌며 
					//메뉴 출력하도록 하기 위해 continue문 사용 
			}
		}	
	}
}
