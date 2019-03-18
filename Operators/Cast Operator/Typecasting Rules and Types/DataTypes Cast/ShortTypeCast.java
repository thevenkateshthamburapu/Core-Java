

public class ShortTypeCast {

	public static void main(String[] args) {
		
		byte a=10;
		short b=25;
		int c=15;
		long d=15639465l;
		float e=12.58f;
		double f=21.23;
		char g='a';
		boolean h=true;
		String i="hi";
		
		short p=a;//byte
		short q=b;//short
		short r=(short) c;//int
		short s=(short) d;//long ->loss decimal values
		short t=(short) e;//float ->loss decimal point values
		short u=(short) f;//double ->loss decimal point values
		short v=(short) g;//char
		//short w=h;//boolean C.E->Type mismatch: cannot convert from boolean to short
		//short x=i;//String C.E->Type mismatch: cannot convert from String to short
		System.out.println("short : "+p+" (byte=10)");
		System.out.println("short : "+q+" (short=25)");
		System.out.println("short : "+r+" (int=15)");
		System.out.println("short : "+s+" (long=15639465l)");
		System.out.println("short : "+t+" (float=12.58f)");
		System.out.println("short : "+u+" (double=21.23)");
		System.out.println("short : "+v+" (char=a)");
		//System.out.println("short : "+w+" (boolean=true)");
		//System.out.println("short : "+x+" (String=hi)");

	}

}
/*if you enter more than short range then it gives equivalent short value.*/