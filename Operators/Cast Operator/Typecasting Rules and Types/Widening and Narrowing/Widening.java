

public class Widening {

	public static void main(String[] args) {
		
		byte a=10;
		//Widening
		short b=a;		//byte value is widening to short
		int c=a;		//byte value is widening to int
		long d=a;		//byte value is widening to long
		float e=a;		//byte value is widening to float
		double f=a;		//byte value is widening to double
		 
		System.out.println("byte value:"+a);
		System.out.println("short value:"+b);
		System.out.println("int value:"+c);
		System.out.println("long value:"+d);
		System.out.println("float value:"+e);
		System.out.println("double value:"+f);
	}

}
