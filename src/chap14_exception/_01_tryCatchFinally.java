package chap14_exception;

public class _01_tryCatchFinally {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		
//		String[] strArr = new String[3];
 		
		int index = 0;
		
		while(true) {
			try {
				System.out.println(arr[index++]);
				//인덱스 3되면 예외 발생
				
//				strArr[0].length(); //null.length 구하라는 거 -> 에러 
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage()); 
				//어떤 오류 발생했는지 메시지 가져옴
				System.out.println(index 
						+ "는 배열에 존재하지 않는 인덱스입니다.");
			} catch(ArithmeticException ae) {	
				//만들면 자동으로 ae객체 만들어지는 거
				//메시지 전달 
				//출력 가넝
			} catch(NullPointerException ne) {
				System.out.println(ne.getMessage());
				System.out.println("널값이라 속성이나 메소드를 사용할 수 없습니다. ");
				//catch 세분화하여 사용 가능 
				//해당하는 예외 찾아와서 출력하는 거
				//예외에 대한 특징 특정할 수 있게 변수명 지어주는 게 좋음 
			} finally {
				if(index < 3) {
					System.out.println("정상출력");
				} else {
					System.out.println("예외발생. while문을 종료합니다.");
					break;
				}
			}
		}
	}
}
