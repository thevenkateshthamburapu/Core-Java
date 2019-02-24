

class Parent{
	public void m1(){
		System.out.println("=====Parent=======");
	}
}
class Child extends Parent{
	public void m1(){
		System.out.println("=====Child=======");
	}
	//comment the child method u can see difference
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child c=new Child();
		c.m1();

	}

}
