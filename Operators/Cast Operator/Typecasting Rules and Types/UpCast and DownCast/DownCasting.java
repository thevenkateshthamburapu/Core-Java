

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
public class DownCasting {

	public static void main(String[] args) {
		
		SuperClass superClass=new SuperClass();
		SubClass subClass=new SubClass();
		SuperClass SuperClass=subClass;
		//SubClass subClass=(SubClass) superClass;//R.Error->SuperClass cannot be cast to SubClass
		SubClass SubClass=(SubClass) SuperClass;
		subClass.show();// it call sub class
		subClass.subMethod();
		subClass.superMethod();//we can access super class methods from sub class
		
		//=============(or)=================
		
		/*SuperClass superClass=new SubClass();
		SubClass subClass=(SubClass) superClass;
		subClass.show();
		subClass.subMethod();
		subClass.superMethod();*/
		
		//============(or)=============
		
		/*SuperClass superClass=new SubClass();
		
		if(superClass instanceof SubClass){
			SubClass subClass=(SubClass) superClass;
			subClass.show();
			subClass.subMethod();
			subClass.superMethod();
		}*/
	}

}
/*Downcasting: Converting a superclass type to a subclass type is known as downcasting.*/
