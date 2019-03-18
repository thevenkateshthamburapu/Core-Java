

public class ObjectFinalizeMethod {
		
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		
		ObjectFinalizeMethod obj=new ObjectFinalizeMethod();
		obj=null;
		System.gc();
		System.out.println("End of the program");

	}

}
/*The object which is eligible for Garbage Collection, that object’s corresponding class finalize method is going to be executed*/

/*Finalize() is the method of Object class. This method is called just before an 
object is garbage collected. finalize() method overrides to dispose system 
resources, perform clean-up activities and minimize memory leaks.*/
