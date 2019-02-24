

class Cal{
	public void sum(){
		System.out.println("========Method One========");
		System.out.println("Addition");
	}
	public void sum(int i){
		System.out.println("========Method Two========");
		System.out.println("value :"+i);
	}
	public void sum(int i,int j){
		System.out.println("========Method Three========");
		System.out.println("sum :"+i+j);//note the difference () & without ()
		System.out.println("sum :"+(i+j));
	}	
	public void sum(double i,double j){
		System.out.println("========Method Four========");
		System.out.println("sum :"+i+j);
		System.out.println("sum :"+(i+j));
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Cal c1=new Cal();
		c1.sum();
		c1.sum(5);
		c1.sum(5, 5);
		c1.sum(4.5, 5.5);
	}
}
