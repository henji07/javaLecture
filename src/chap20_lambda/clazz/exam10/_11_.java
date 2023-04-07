package chap20_lambda.clazz.exam10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _11_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//UserCharString타입의 값은 UserCharString타입의 객체 = new UserCharString
		List<UserCharString> list = new ArrayList<UserCharString>(); 
		
		
		//10개를 뽑아야 함 
		for(int i = 0; i < 3; i++) {
			System.out.println((i+1) + "번째 문자열을 입력하세요.");
			//String input = sc.nextLine(); 생략
			list.add(new UserCharString(sc.nextLine())); 
			//String값이니까 그 객체의 str값이 사용자가 입력한 값으로 바로 입력됨
			//사용자가 입력하는 값으로 생성자 구현 
		} 
		//a bfg vvgg ffg get(0), get(1), get(2), get(3)리스트 만들어진 거 
		
		
		System.out.println("찾을 문자를 입력하세요.");
		char findCh = sc.next().charAt(0); 
		
		for(int i = 0; i < 3; i++) {
			int num = i;
			list.get(i).changeStr(findCh, (ch, str) -> {
				if(str.contains(String.valueOf(ch))) {
					return str;
				} else {
					return "";
				}	
			});
		}
		System.out.println(list.toString());		
	}

}
