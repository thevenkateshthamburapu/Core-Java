

class SuperClass{
	
	public void show(){
		System.out.println("=====This is SuperClass======");
	}
	public void superMethod(){
		System.out.println("===Super Class Method===");
	}
	
}
class SubClass extends SuperClass{
	
	public void show(){
		System.out.println("=====This is SubClass======");
	}
	public void subMethod(){
		System.out.println("===Sub Class Method===");
	}
}
public class UpCasting {

	public static void main(String[] args) {
	
		SuperClass superClass=new SuperClass();
		SubClass subClass=new SubClass();
		SuperClass superClass1=subClass;
		superClass1.show();// it call sub class
		superClass1.superMethod();
		//superClass1.subDisplay();//C.Error ->Super class Cannot Access Sub class methods
									//it call common methods 
		
		//=====(or)=======
		//we can use both
		
		/*SuperClass superClass=new SubClass();//Up Casting
		superClass.show();
		superClass.superMethod();
		//superClass.subDisplay();//C.Error ->Super class Cannot Access Sub class methods
		*/
	}

}
/*Upcasting: Converting a subclass type to a superclass type is known as up casting.*/