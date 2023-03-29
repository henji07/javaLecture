package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer(100); //버퍼 크기 100으로
		StringBuffer  sb2 = new StringBuffer("bitcamp");
		
		sb1.append("navercloud");
		
		//capacity()와 length()의 차이점
		System.out.println(sb1.capacity()); 
		//지정한 버퍼 크기 100
		System.out.println(sb1.length()); 
		//담겨있는 문자열 길이 10
		
		
		//delete()와 insert()
		StringBuffer sb3 = sb2.delete(3, 7);
		System.out.println(sb3); //bit
		
		sb3 = sb3.insert(3, "camp");
		System.out.println(sb3); //bitcamp
		
		//reverse()
		sb1 = sb1.reverse(); 
		System.out.println(sb1); //duolcrevan 뒤집어놓으심..
		
		//setCharAt()
		sb3.setCharAt(3, 'C');
		System.out.println(sb3); //bitCamp
		
		//setLength()
		sb3.setLength(20);
		System.out.println(sb3); 

	}

}
