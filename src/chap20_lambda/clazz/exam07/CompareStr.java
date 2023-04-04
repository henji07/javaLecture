package chap20_lambda.clazz.exam07;

@FunctionalInterface
public interface CompareStr {	
	
	//인터페이스 추상 메소드에 리턴값 있는 경우
	//return문 하나만 있을 경우 중괄호와 함께 return 키워드를 생략할 수 있다. 
	//리턴값은 연산식 또는 리턴값 있는 메소드 호출로 대체할 수 있다. 
	public boolean compareTwoStr(String a, String b); 

}
