

class Parent{
	
	public static void printMessage(){
		System.out.println("Parent Static method");
	}
}
class Child extends Parent{
	public static void printMessage(){
		System.out.println("Child Static method");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		
		Child.printMessage();

	}

}
/*When super class and sub class contains same method including parameters and if they are static.

The method in the super class will be hidden by the one that is in the sub class. This mechanism is known as method hiding
*/

/*Hiding doesn’t work like overriding, because static methods are not polymorphic. Overriding occurs only with instance methods. It supports late binding, so which method will be called is determined at runtime.

On the other hand, method hiding works with static ones. Therefore it’s determined at compile time.
*/

/* static method cannot be overridden.
  Why can we not override static method?

	It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.
*/