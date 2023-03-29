package chap15_usefulClass;

public class _04_String03 {

	public static void main(String[] args) {
		
		String str1 = "bit-naver-cloud";
		String str2 = "kiaCar";
		String str3 = "aBcDcF";
		int num1 = 1234;
		double num2 = 1234.5678;
		boolean a = true;
		
		//특정 문자로 문자열 자르기 
		String[] strArr = str1.split("-");
		
		//잘라서 배열로 만들어서 사용
		for(String s : strArr) { 
			//향상된 for문 - 하나씩 꺼내는 거
			//0번째 배열 꺼내서 출력 - s로 사용
			//1번째 배열 꺼내서 출력 - s로 사용
			//길이만큼 계속 도는 거 
			System.out.println(s);
		}
		
		//인덱스로 문자열 자르기 
		
		System.out.println(str2.substring(4)); 
		//4부터 끝까지
		System.out.println(str2.substring(2, 4)); 
		//2번부터 3까지
		System.out.println(str2.substring(str2.indexOf('a'))); 
		//a 만났을 때 인덱스부터 다 잘라
		
		System.out.println(str2.substring(1, str2.length() - 1));
		
		
		//대문자, 소문자 치환
		//확장자 .jpg .JPG 
		//=> toLowerCase()로 소문자로 바꿔서 확장자 비교함
		System.out.println(str3.toLowerCase()); //소문자
		System.out.println(str3.toUpperCase()); //대문자 
		
		//문자열의 앞뒤 공백 없애기 
		String str4 = "            aaabbb     ddd   ";
		System.out.println(str4.trim());
		
		//다른 타입의 값을 String으로 변환 
		//String타입으로 변환되기 때문에 String타입으로 받을 수 있다
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		String s3 = String.valueOf(a);
		
		String s4 = Integer.valueOf(num1).toString();//래퍼클래스 이용
		
		System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);

	}

}
