

public class ReturnTypeMethod {
	
	public int sum(int a,int b){//non-static method
		int sum=a+b;
		return sum;		//returning value
		
		//return a+b;
	}
	
	public static void main(String[] args) {
		
		Return r=new Return();
		
		System.out.println(r.sum(10, 20));//returned value
		System.out.println("============");
		//we can 
		int result=r.sum(20, 30);
		System.out.println(result);//returned value
		
	}

}
