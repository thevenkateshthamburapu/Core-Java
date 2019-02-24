

public class DoubleDataType {
	
	static double a;//if you not initialize any value then compiler will initialize the default value.
	public static void main(String[] args) {
		
		double b=10.12;
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}

}
/*
Type	DefaultValue	Size-in-Bytes	Size-in-bits	Range
=============================================================================================================================
double	 	0.0			8 bytes			64 bits			approximately ±1.79769313486231570E+308(15 significant decimal digits)
*/