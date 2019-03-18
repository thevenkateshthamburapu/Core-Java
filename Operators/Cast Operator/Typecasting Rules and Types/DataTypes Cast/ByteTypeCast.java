

public class ByteTypeCast {

	public static void main(String[] args) {
		
		byte a=10;//change 1000 and observe the output
		short b=25;
		int c=15;
		long d=15639465l;
		float e=12.58f;
		double f=21.23;
		char g='a';
		boolean h=true;
		String i="hi";
		
		byte p=a;//byte
		byte q=(byte) b;//short
		byte r=(byte) c;//int
		byte s=(byte) d;//long ->loss decimal values
		byte t=(byte) e;//float ->loss decimal point values
		byte u=(byte) f;//double ->loss decimal point values
		byte v=(byte) g;//char
		//byte w=h;//boolean C.E->Type mismatch: cannot convert from boolean to byte
		//byte x=i;//String C.E->Type mismatch: cannot convert from String to byte
		System.out.println("byte : "+p+" (byte=10)");
		System.out.println("byte : "+q+" (short=25)");
		System.out.println("byte : "+r+" (int=15)");
		System.out.println("byte : "+s+" (long=15639465l)");
		System.out.println("byte : "+t+" (float=12.58f)");
		System.out.println("byte : "+u+" (double=21.23)");
		System.out.println("byte : "+v+" (char=a)");
		//System.out.println("byte : "+w+" (boolean=true)");
		//System.out.println("byte : "+x+" (String=hi)");
		
	}

}
/*if you enter more than byte range then it gives equivalent byte value.*/