

class Flower{
	public void smell(){
		System.out.println("Flower gives smells");
	}
}
class Raspberry extends Flower{
	public void smell(){
		System.out.println("Raspberry smells like raspberries");
	}
}
public class NarrowingCustomClass {

	public static void main(String[] args) {
		
		Flower flower=new Raspberry();//object of subclass(Raspberry) is referenced by reference of superclass(Flower)
		//Narrowing
		Raspberry raspberry=(Raspberry) flower;//reference of a superclass(Raspberry) type is downcasted/narrowed to the reference of subclass(Flower) type.
		raspberry.smell();
				

	}

}
