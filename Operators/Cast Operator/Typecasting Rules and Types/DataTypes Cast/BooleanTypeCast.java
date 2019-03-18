

public class BooleanTypeCast {

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
		
		//boolean p=a;//byte C.E->Type mismatch: cannot convert from byte to boolean
		//boolean q=b;//short C.E->Type mismatch: cannot convert from short to boolean
		//boolean r=c;//int C.E->Type mismatch: cannot convert from int to boolean
		//boolean s=d;//long C.E->Type mismatch: cannot convert from long to boolean
		//boolean t=e;//float C.E->Type mismatch: cannot convert from float to boolean
		//boolean u=f;//double C.E->Type mismatch: cannot convert from double to boolean
		//boolean v=g;//char C.E->Type mismatch: cannot convert from char to boolean
		boolean w=h;//boolean 
		//boolean x=i;//String C.E->Type mismatch: cannot convert from String to boolean
		//System.out.println("boolean : "+p+" (byte=10)");
		//System.out.println("boolean : "+q+" (short=25)");
		//System.out.println("boolean : "+r+" (int=15)");
		//System.out.println("boolean : "+s+" (long=15639465l)");
		//System.out.println("boolean : "+t+" (float=12.58f)");
		//System.out.println("boolean : "+u+" (double=21.23)");
		//System.out.println("boolean : "+v+" (char=a)");
		System.out.println("boolean : "+w+" (boolean=true)");
		//System.out.println("boolean : "+x+" (String=hi)");


	}

}
