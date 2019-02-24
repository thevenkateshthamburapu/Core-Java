

class Car{
	String carName;
	String carModel;
}

public class NewOperator {

	public static void main(String[] args) {
		
		Car car=new Car();
		//without assign values
		System.out.println("====without assign values=====");
		System.out.println(car.carName);
		System.out.println(car.carModel);
		//with assign values
		System.out.println("====with assign values=====");
		car.carName="Audi";
		car.carModel="R8";
		System.out.println(car.carName);
		System.out.println(car.carModel);
		
	}

}
