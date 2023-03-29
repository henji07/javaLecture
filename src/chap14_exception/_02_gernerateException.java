package chap14_exception;

public class _02_gernerateException {

	public static void main(String[] args) {
		
		try { //try안의 코드는 무조건 실행 
//			ArrayIndexOutOfBoundsException aie = 
//					new ArrayIndexOutOfBoundsException("인덱스가 초과됐습니다.");
//			throw aie;
			
			//1. NullPoninterException
//			NullPointerException ne = new NullPointerException("널값입니다.");
//			throw ne;
			//메시지 비우면 null
			//int값 주면 기본 메시지 
			
			
//			//2. ArithmeticExcepion
			//메시지 안 쓰면 null
			//String 써주면 그대로 나옴
			
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			
		} catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
			
		} catch (Exception e) {
			//마지막 catch문은 위에 선언한 catch문을 
			//다 통과한 예외 처리할 수 있게 
			//모든 예외를 담을 수 있는 예외의 최상위 클래스 
			//Exception으로 예외를 처리해준다. 
			System.out.println(e.getMessage());
		} 	
	}
}
