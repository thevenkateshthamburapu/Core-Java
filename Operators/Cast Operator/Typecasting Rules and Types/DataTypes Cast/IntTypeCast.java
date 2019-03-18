

public class IntTypeCast {

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
		
		int p=a;//byte
		int q=b;//short
		int r=c;//int
		int s=(int) d;//long
		int t=(int) e;//float ->loss decimal point values
		int u=(int) f;//double ->loss decimal point values
		int v=g;//char
		//int w=h;//boolean C.E->Type mismatch: cannot convert from boolean to int
		//int x=i;//String C.E->Type mismatch: cannot convert from String to int
		System.out.println("int : "+p+" (byte=10)");
		System.out.println("int : "+q+" (short=25)");
		System.out.println("int : "+r+" (int=15)");
		System.out.println("int : "+s+" (long=15639465l)");
		System.out.println("int : "+t+" (float=12.58f)");
		System.out.println("int : "+u+" (double=21.23)");
		System.out.println("int : "+v+" (char=a)");
		//System.out.println("int : "+w+" (boolean=true)");
		//System.out.println("int : "+x+" (String=hi)");

	}

}
