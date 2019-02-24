

public class TypeCasting {

	public static void main(String[] args) {
		
		double d =5;//implict conversion
		System.out.println("===implict conversion====");
		System.out.println(d);
		int i=(int) 6.9;//explict conversion
		System.out.println("===explict conversion===");
		System.out.println(i);
		
		
		int m=6,n=4;
		int r1=m+n;
		int r2=m-n;
		int r3=m*n;
		double r4=(double)m/n;//casting
		int r5=m%n;
		System.out.println("\nInputs are: m="+m+" n="+n);
		System.out.println("Addition="+r1);
		System.out.println("Subtraction="+r2);
		System.out.println("Multiplication="+r3);
		System.out.println("Division="+r4);
		System.out.println("Modulus Mivision="+r5);
	}

}
