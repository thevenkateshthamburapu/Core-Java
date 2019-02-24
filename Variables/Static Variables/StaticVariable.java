

public class StaticVariable {
	
	static int a;//StaticVariable
	static int b;//StaticVariable

	public static void main(String[] args) {
		//we can access static by class or directly
		a=10;
		b=20;
		System.out.println("Sum="+(a+b));
		//OR
		System.out.println("================");
		StaticVariable.a=20;
		StaticVariable.b=30;
		System.out.println("Sum="+(a+b));

	}
}
