

public class CharDataType {

	static char a;//if you not initialize any value then compiler will initialize the default value.
	public static void main(String[] args) {
		
		char b='b';
		System.out.println("Value of a="+a);
		System.out.println("Value of b="+b);
	}

}
/*
Type	DefaultValue	Size-in-Bytes	Size-in-bits	Range
==============================================================================
char	 \u0000			16 bits			2 byte			0 to 65,536 (unsigned)
*/