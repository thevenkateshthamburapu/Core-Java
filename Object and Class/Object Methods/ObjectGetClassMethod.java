

class Car{
	
}

public class ObjectGetClassMethod {

	public static void main(String[] args) {
		
		Object obj1=new String("Hello");
		System.out.println(obj1.getClass());
		Integer obj2=new Integer(10);
		System.out.println(obj2.getClass());
		Car car=new Car();
		System.out.println(car.getClass());

	}

}
/*This method returns the object of type Class that represents the runtime class of the object.*/