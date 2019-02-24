
class Car{
	
	String carName;
	String carModel;
	String fuel;
	
}

public class MultipleObjects {

	public static void main(String[] args) {
		
		Car audi=new Car();
		audi.carName="Audi";
		audi.fuel="Petrol";
		audi.carModel="R8";
		System.out.println("Car Name="+audi.carName);
		System.out.println("Car Model="+audi.carModel);
		System.out.println("Fuel Type="+audi.fuel);
		System.out.println("======================");
		Car mahindra=new Car();
		mahindra.carName="Mahindra";
		mahindra.fuel="Diesel";
		mahindra.carModel="TUV300";
		System.out.println("Car Name="+mahindra.carName);
		System.out.println("Car Model="+mahindra.carModel);
		System.out.println("Fuel Type="+mahindra.fuel);
	}

}
