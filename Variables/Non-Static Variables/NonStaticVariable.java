

public class NonStaticVariable {
	
	int a;//NonStaticVariable
	int b;//NonStaticVariable
	public static void main(String[] args) {
		//if you want access non static variable you must declare object
		NonStaticVariable ns=new NonStaticVariable();
		ns.a=6;
		ns.b=8;
		System.out.println("Sum="+(ns.a+ns.b));
	}
}
//non-static variable also called instance variable