package chap20_lambda.clazz.exam04;

@FunctionalInterface
public interface CustomString {
	
	//함수형 인터페이스는 메소드 하나만 존재!!
	String concat(String a, String b); 
	// 원래는 a에다 b 붙이는데, b에다 a 붙이도록 구현 

}
