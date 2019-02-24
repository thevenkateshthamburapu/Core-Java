
interface Interface{
	
	public void show();
}

public class InterfaceName implements Interface {
	
	@Override
	public void show() {
		System.out.println("========This is Interface Method=======");
		
	}

	public static void main(String[] args) {
		
		//Interface obj=new Interface();//we Cannot instantiate the type Interface
		Interface obj=new InterfaceName();
		obj.show();
		
	}

	
}
/*The non-primitive data types generates objects*/