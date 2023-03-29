package chap15_usefulClass;

public class _01_object {
	public static class Example implements Cloneable {		
		//clone 메소드는 Cloneable 인터페이스를 상속 받아
		//clone()를 직접 구현해야 사용할 수 있다. 
		//static으로 한 이유는 객체 안 만들어도 쓸 수 있으니까!
		public Object clone() {
			Object obj = null;
			
			try {
				//super.clone() Object에 있는 
				//clone메소드를 호출하는데
				//clone메소드에서 전달하는 예외가 
				//CloneNotSupportedException이기 때문에
				//catch구문에서 동일한 예외로 받아준다. 
				//예외 정보 아예 모를 때는 Exception으로 받아주면 됨 
				obj = super.clone(); //여기서 복제한 거 
			} catch(CloneNotSupportedException ce) {
	//implements Cloneable 안 써주면 왜 상속 안 받았냐고 에러 잡는 거
				System.out.println(ce.getMessage());
			}
			return obj;
		}
	}


	public static void main(String[] args) {
		
		Example ex1 = new Example();
		
		//객체의 깊은 복사
		Example ex2 = (Example)ex1.clone();
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		//객체의 얕은 복사 
		ex2 = ex1;
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}
}
