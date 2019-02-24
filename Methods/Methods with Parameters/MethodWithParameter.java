

public class MethodWithParameter {
	
	public void sub(int a,int b){
		System.out.println("Sub="+(a-b));
	}
	public static void main(String[] args) {
		
		MethodWithParameter mwp=new MethodWithParameter();
		mwp.sub(50, 30);

	}

}
