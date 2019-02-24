

public class MethodWithoutParameter {
	
	int a;
	int b;
	public void sub(){
		System.out.println("Sub="+(a-b));
	}

	public static void main(String[] args) {

		MethodWithoutParameter mwp=new MethodWithoutParameter();
		mwp.a=50;
		mwp.b=30;
		mwp.sub();

	}

}
