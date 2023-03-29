package chap17_generic;

public class _02_genericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = 
				{"java", "javascript", "html"};
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		//이렇게 해도 되고
//		String result1 = getLastEle(strArr);
//		Integer result2 = getLastEle(intArr);
//		
		
		//추론에 의해 됨
		String result1 = getLastEle(strArr);
		Integer result2 = getLastEle(intArr);
		
		System.out.println("strArr의 마지막 요소는"
				+ result1);
		
		System.out.println("strArr의 마지막 요소는"
				+ result2);
			
	}
	//T자리에 원시타입은 못 들어옴 
	public static <T> T getLastEle(T[] tArr) {
		return tArr[tArr.length - 1];
	}
}
