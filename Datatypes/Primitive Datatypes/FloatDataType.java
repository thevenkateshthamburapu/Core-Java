

public class FloatDataType {

	static float a;//if you not initialize any value then compiler will initialize the default value.
	public static void main(String[] args) {
		
		float b=10F;//if you not declare "f" or "F" then compiler take it as double.
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}

}
/*
Type	DefaultValue	Size-in-Bytes	Size-in-bits	Range
=========================================================================================================================================================
float	 	0.0			4 bytes			32 bits			approximately ±3.40282347E+38F (6-7 significant decimal digits) Java implements IEEE 754 standard
*/