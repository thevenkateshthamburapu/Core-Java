

public class LongTypeCast {

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
		
		long p=a;//byte
		long q=b;//short
		long r=c;//int
		long s=d;//long
		long t=(long) e;//float ->loss decimal point values
		long u=(long) f;//double ->loss decimal point values
		long v=g;//char
		//long w=h;//boolean C.E->Type mismatch: cannot convert from boolean to long
		//long x=i;//String C.E->Type mismatch: cannot convert from String to long
		System.out.println("long : "+p+" (byte=10)");
		System.out.println("long : "+q+" (short=25)");
		System.out.println("long : "+r+" (int=15)");
		System.out.println("long : "+s+" (long=15639465l)");
		System.out.println("long : "+t+" (float=12.58f)");
		System.out.println("long : "+u+" (double=21.23)");
		System.out.println("long : "+v+" (char=a)");
		//System.out.println("long : "+w+" (boolean=true)");
		//System.out.println("long : "+x+" (String=hi)");

	}

}
