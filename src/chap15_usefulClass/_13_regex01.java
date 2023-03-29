package chap15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _13_regex01 {

	public static void main(String[] args) {
		
		//휴대폰 번호에 대한 정규식
		String pattern = "010.*-[0-9]{4}.*-[0-9]{4}";
		
		//검사할 문자열
		String test = "010-1111-2222";
		
		//패턴 객체
		Pattern pt = Pattern.compile(pattern);
		
		//test를 Matcher객체로
		Matcher m = pt.matcher(test);
		
		if(m.matches()) {
			System.out.println("전화번호 양식이 맞습니다.");
		} else {
			System.out.println("다시 입력하세요.");
		}

	}

}
