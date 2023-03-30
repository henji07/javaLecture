package chap999_arrangement.casting;

public class _05casting {

	public static void main(String[] args) {
		// int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환
		
		int iNum = 10;
		long lNum = 20L;
		
		System.out.println("iNum = " + iNum + " lNum = " + lNum);
		
		int temp = iNum;
		iNum = (int)lNum;
		lNum = temp;
		
		System.out.println("iNum = " + iNum + " lNum = " + lNum);	

	}

}
