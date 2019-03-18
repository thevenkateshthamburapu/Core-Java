

public class ObjectEqualsMethod {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		String str3="hello";
		System.out.println("Str1 is equals to Str2:"+str1.equals(str2));
		System.out.println("Str1 is equals to Str3:"+str1.equals(str3));
		
		Integer a=25;
		Integer b=25;
		System.out.println("a is equals to b:"+a.equals(b));
		
	}

}
/*equals() method to check whether two objects contains the same data or not.*/