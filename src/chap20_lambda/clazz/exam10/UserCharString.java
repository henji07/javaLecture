package chap20_lambda.clazz.exam10;

public class UserCharString {
	
	//매개변수
	private String str;

	//생성자
	public UserCharString(String str) {
		this.str = str;
	}

	//getter setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//메소드
	public String changeStr(char ch, UserChar uc){ //char매개변수 하나, 함수형 인터페이스 하나 받는 메소드
		str = uc.findUserChar(ch, str);
		return str;
	}

	//list toString으로 바로 출력하기 위해서 만듦!
	@Override
	public String toString() {
		return "UserCharString [str=" + str + "]";
	}
}
