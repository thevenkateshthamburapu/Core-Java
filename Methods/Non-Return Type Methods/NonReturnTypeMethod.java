

public class NonReturnTypeMethod {
	
	public void sum(int a,int b){//non-static method
		System.out.println("Sum="+(a+b));// non-return
	}
	public static void main(String[] args) {
		
		NonReturn nr=new NonReturn();
		nr.sum(10, 15);
		
	}

}
