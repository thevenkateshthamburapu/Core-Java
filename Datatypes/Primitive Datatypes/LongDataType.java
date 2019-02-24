

public class LongDataType {
	
	static long a;//if you not initialize any value then compiler will initialize the default value.
	public static void main(String[] args) {
		
		long b=10L;//if you not declare "l" or "L" then compiler take it as int.
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);

	}

}
/*
Type	DefaultValue	Size-in-Bytes	Size-in-bits	Range
=========================================================================
long	 	0			8 bytes			64 bits			-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
*/