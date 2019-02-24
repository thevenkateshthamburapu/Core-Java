

class Test{
	int num1;
	int num2;
	
	//ZeroParameterConstructor
	public Test() {
	
	num2=5;// we can change the default values of data types
	System.out.println("ZeroParameterConstructor");
	}

}

public class ZeroParameterConstructor {

	public static void main(String[] args) {
					//constructor call
		Test obj=new Test();//constructor call
		System.out.println(obj.num1);//default value 
		System.out.println(obj.num2);//constructor defult value

	}

}
//will be called automatically when object created
//constructor call is available object creation
//				constructor call
//ex: Test obj=new Test();