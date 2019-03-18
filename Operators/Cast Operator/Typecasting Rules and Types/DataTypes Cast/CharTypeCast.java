

public class CharTypeCast {

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
		
		char p=(char) a;//byte 
		char q=(char) b;//short 
		char r=(char) c;//int 
		char s=(char) d;//long 
		char t=(char) e;//float
		char u=(char) f;//double
		char v=g;//char 
		//char w=h;//boolean C.E->Type mismatch: cannot convert from boolean to char
		//char x=i;//String C.E->Type mismatch: cannot convert from String to char
		System.out.println("char : "+p+" (byte=10)");
		System.out.println("char : "+q+" (short=25)");
		System.out.println("char : "+r+" (int=15)");
		System.out.println("char : "+s+" (long=15639465l)");
		System.out.println("char : "+t+" (float=12.58f)");
		System.out.println("char : "+u+" (double=21.23)");
		System.out.println("char : "+v+" (char=a)");
		//System.out.println("char : "+w+" (boolean=true)");
		//System.out.println("char : "+x+" (String=hi)");


	}

}
