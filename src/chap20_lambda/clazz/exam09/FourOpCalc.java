package chap20_lambda.clazz.exam09;

public class FourOpCalc {
	
	//operator에 따라 연산 다르게 되는 메소드 calc()
	public int calc(int a, int b, char op, FourOperation fo) {
		int result = fo.operate(a, b);
		return result;
	}
	
	

}
