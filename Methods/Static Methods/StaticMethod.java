

public class StaticMethod {
	
	static int a;//StaticVariable
	static int b;//StaticVariable
	static int c;//StaticVariable
	public static void add(){ //StaticMethod
		c=a+b;
		System.out.println("Sum="+c);
	}
	public static void main(String[] args) {
		a=15;
		b=15;
		add();
		//or
		System.out.println("==================");
		StaticMethod.a=30;
		StaticMethod.b=20;
		StaticMethod.add();

	}

}
