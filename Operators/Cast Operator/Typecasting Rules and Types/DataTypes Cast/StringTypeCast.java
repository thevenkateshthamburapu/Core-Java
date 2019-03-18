

public class StringTypeCast {

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
		
		//String p=a;//byte C.E->Type mismatch: cannot convert from byte to String
		//String q=b;//short C.E->Type mismatch: cannot convert from short to String
		//String r=c;//int C.E->Type mismatch: cannot convert from int to String
		//String s=d;//long C.E->Type mismatch: cannot convert from long to String
		//String t=e;//float C.E->Type mismatch: cannot convert from float to String
		//String u=f;//double C.E->Type mismatch: cannot convert from double to String
		//String v=g;//char C.E->Type mismatch: cannot convert from char to String
		//String w=h;//boolean C.E->Type mismatch: cannot convert from boolean to String
		String x=i;//String 
		//System.out.println("String : "+p+" (byte=10)");
		//System.out.println("String : "+q+" (short=25)");
		//System.out.println("String : "+r+" (int=15)");
		//System.out.println("String : "+s+" (long=15639465l)");
		//System.out.println("String : "+t+" (float=12.58f)");
		//System.out.println("String : "+u+" (double=21.23)");
		//System.out.println("String : "+v+" (char=a)");
		//System.out.println("String : "+w+" (boolean=true)");
		System.out.println("String : "+x+" (String=hi)");


	}

}
