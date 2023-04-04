package chap20_lambda.clazz.exam02;


public class _02_nonParamLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(()-> {
			System.out.println(3 + 4);
			System.out.println(5 + 6);
		});
		
		action(()-> System.out.println(10 + 20));
	}
	
	public static void action(Add add) {
		add.add();
	}
}
