

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
public class WideningCustomClass {

	public static void main(String[] args) {
		
		Raspberry raspberry=new Raspberry();
		//Widening
		Flower flower=raspberry;////reference of a subclass(Raspberry) type is widened to the reference of superclass(Flower) type
		flower.smell();
	}

}
