package chap15_usefulClass;

import java.util.ArrayList;
import java.util.List;

public class _03_String02 {

	public static void main(String[] args) {
		
		String str1 = "computer";
		String str2 = "smartPhone";
		String str3 = "abcdhadecba";
		
		//포함여부 검사
		if(str1.contains("t")) {
			System.out.println("str1은 t를 포함합니다.");
		} else if (str1.contains("p")) {
			System.out.println("str1은 P를 포함합니다.");
		} else {
			System.out.println("str1은 t, P를 포함하지 않습니다.");
		} 
		
		//해당 문자나 문자열의 인덱스 확인 
		int index1 = str2.indexOf('h');
		int index2 = str3.indexOf('a', 4);
		int index3 = str3.indexOf("adc");
		
		int index4 = str3.lastIndexOf('h');
		int index5 = str3.lastIndexOf('a', 7);
		int index6 = str3.lastIndexOf("bc");
		
		System.out.println(index1 + " " +  index2 + " " + index3 + " " 
							+ index4 + " " + index5 + " " + index6);
		
		//문자열 길이
		int[] intArr = new int[10];
		System.out.println(intArr.length); 
		// 배열에서는 length가 속성값
		
		System.out.println("str1의 길이는 " + str1.length() + "입니다."); 
		// String은 length가 메서드
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1); 
		intList.add(1);
		intList.add(1);
		intList.add(1);
		System.out.println(intList.size());
		//List는 length가 메서드의 사이즈 
		
		//replace, replaceAll (정규식 사용 가능)
		String str4 = "abc"
				+ "abc"
				+ "abc"
				+ "aabbcc";
		
		System.out.println(str4.replace("abc", "111"));
		System.out.println(str4.replaceAll("[ac]", "2")); 
							//[]안의 문자를 전부 치환한다. 
		System.out.println(str4.replace('a','1')
								.replace('b', '2')
								.replace('c', '3')); 
								//chaning기법?? 
								//결과값에 계속 .찍어서 사용 가능이여~

	}

}
