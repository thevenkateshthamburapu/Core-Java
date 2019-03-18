

public class Narrowing {

	public static void main(String[] args) {
		
		double a=10.12;
		//Narrowing
		float b=(float) a;		//Narrowing double to float 
		long c=(long) a;		//Narrowing double to long
		int d=(int) a;			//Narrowing double to int 
		short e=(short) a;		//Narrowing double to short 
		byte f=(byte) a;		//Narrowing double to byte
		
		System.out.println("double value:"+a);
		System.out.println("float value:"+b);
		System.out.println("long value:"+c);
		System.out.println("int value:"+d);
		System.out.println("short value:"+e);
		System.out.println("byte value:"+f);

	}

}
