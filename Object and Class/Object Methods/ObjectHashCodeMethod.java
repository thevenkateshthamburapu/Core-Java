

public class ObjectHashCodeMethod {

	public static void main(String[] args) {
		
		String str=new String("Hi");
		System.out.println("HashCode of "+str+" : "+str.hashCode());
		Integer a=new Integer(10);
		System.out.println("HashCode of "+a+" : "+a.hashCode());
		Boolean d=new Boolean("ask");
		System.out.println("HashCode of "+d+" :"+d.hashCode());
		Boolean e=new Boolean(false);
		System.out.println("HashCode of "+e+" :"+e.hashCode());
		Boolean f=new Boolean(true);
		System.out.println("HashCode of "+f+" :"+f.hashCode());

		
	}

}
/*This method returns a hash code value for this object.*/

/*more details about hashcode() go through below link
 https://stackoverflow.com/questions/3563847/what-is-the-use-of-hashcode-in-java/15019075#15019075
 */
/*hashCode() Method:
The hashCode() is a method of Java Integer Class which determines the hash code for a given Integer. It overrides hashCode in class Object. By default, this method returns a random integer that is unique for each instance.

hashCode(int value) Method:
The hashCode(int value) is an inbuilt Java Integer Class method which determines a hash code for a given int value. This method is compatible with Integer.hashCode().
*/
