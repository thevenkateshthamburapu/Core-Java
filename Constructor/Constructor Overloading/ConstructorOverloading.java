

public class ConstructorOverloading {
	
	public ConstructorOverloading(){
		System.out.println("Zero parameters");
	}
	
	public ConstructorOverloading(int i){
		System.out.println("Value: "+i);
	}
	
	public ConstructorOverloading(int i,int j){
		System.out.println("Vaule: "+i+"\tValue :"+j);
	}
	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading();
		ConstructorOverloading c1=new ConstructorOverloading(5);
		ConstructorOverloading c2=new ConstructorOverloading(4,5);
	}

}
//There is no concept of static constructor in java

/*
There is no concept of constructor overriding because
we cannot have same named constructors in  parent & child
class
 */