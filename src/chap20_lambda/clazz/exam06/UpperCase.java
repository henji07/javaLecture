package chap20_lambda.clazz.exam06;

//모든 문자를 대문자로 바꿔서 출력해주는 인터페이스
@FunctionalInterface
public interface UpperCase {
	public String allUpperCase(String a);
}
