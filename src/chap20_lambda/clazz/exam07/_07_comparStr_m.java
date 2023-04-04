package chap20_lambda.clazz.exam07;

public class _07_comparStr_m {
	public static void main(String[] args) {
		action(String :: equals);
		
	}
	
	//CompareStr을 매개변수로 갖는 action()메소드
	public static void action(CompareStr comp) {
		boolean result = comp.compareTwoStr("구만짱", "구만짱");
		
		if(result == true) {
			System.out.println("두 문자는 같습니다.");
		} else {
			System.out.println("두 문자는 다릅니다.");
		}	
	} 
}


