package chap15_usefulClass;

public class _06_stringBuffer01 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("bitcamp");
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		System.out.println(sb1 == sb2);
		//equals()가 오버라이딩되어 있지 않아서 
		//문자열 값을 비교할 수 없다. 
		//같은 객체인지만 비교해줌 
		//같은 객체 안 바라보고 주소값 다름
		System.out.println(sb1.equals(sb2));
		
		//문자열로 변환해서 값을 비교한다. 
		//값을 비교하려면 문자열로 바꿔서 비교해야 함
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		
		//값은 같지만 주소값이 다른 객체
		System.out.println(str1.equals(str2));
		System.out.println(sb1 == sb2);

	}

}
