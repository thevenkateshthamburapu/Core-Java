

public class NonStaticMethod {
	
	int a;//NonStaticVariable
	int b;//NonStaticVariable
	int c;//NonStaticVariable
	public void add(){ //NonStaticMethod
		c=a+b;
		System.out.println("Sum="+c);
	}
	public static void main(String[] args) {
		NonStaticMethod nsm=new NonStaticMethod();
		nsm.a=12;
		nsm.b=13;
		nsm.add();//method call
	}
}
