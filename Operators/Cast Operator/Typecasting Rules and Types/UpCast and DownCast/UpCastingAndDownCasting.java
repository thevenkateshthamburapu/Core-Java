

class SuperClass{
	
	public void show(){
		System.out.println("This is SuperClass");
	}
	public void superMethod(){
		System.out.println("Super Class Method");
	}
}
class SubClass extends SuperClass{
	
	public void show(){
		System.out.println("This is SubClass");
	}
	public void subMethod(){
		System.out.println("Sub Class Method");
	}
}
public class UpCastingAndDownCasting {

	public static void main(String[] args) {
		
		SuperClass superClass1=new SuperClass();
		superClass1.show();
		superClass1.superMethod();
		SubClass subClass1=new SubClass();
		subClass1.show();
		subClass1.subMethod();
		subClass1.superMethod();
		
		//Up Casting
		System.out.println("=========Up Casting==========");
		SuperClass superClass2=new SubClass();
		superClass2.show();
		superClass2.superMethod();
		//superClass2.subMethod();//C.Error ->Super class Cannot Access Sub class methods
									//it call common methods 
		
		//Down Casting
		System.out.println("=========Down Casting==========");
		SuperClass superClass3=new SubClass();
		SubClass subClass2=(SubClass) superClass3;
		subClass2.show();
		subClass2.subMethod();
		subClass2.superMethod();//we can access super class methods from sub class
		
	}

}
