

class Vehical{
	String name;
	int speed;
	//ParameterConstructor
	public Vehical(String n, int s) {
		
		name = n;
		speed = s;
		System.out.println("ParameterConstructor");
	}

}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Vehical v=new Vehical("BMW", 200);//constructor call
		System.out.println(v.name);
		System.out.println(v.speed);
	}

}
//we can change the default values of data types
