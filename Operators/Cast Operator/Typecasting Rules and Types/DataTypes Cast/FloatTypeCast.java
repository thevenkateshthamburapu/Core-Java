

public class FloatTypeCast {

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
		
		float p=a;//byte ->gain decimal point
		float q=b;//short ->gain decimal point
		float r=c;//int ->gain decimal point
		float s=d;//long ->gain or loss decimal point
		float t=e;//float
		float u=(float) f;//double
		float v=g;//char ->gain decimal point
		//float w=h;//boolean C.E->Type mismatch: cannot convert from boolean to float
		//float x=i;//String C.E->Type mismatch: cannot convert from String to float
		System.out.println("float : "+p+" (byte=10)");
		System.out.println("float : "+q+" (short=25)");
		System.out.println("float : "+r+" (int=15)");
		System.out.println("float : "+s+" (long=15639465l)");
		System.out.println("float : "+t+" (float=12.58f)");
		System.out.println("float : "+u+" (double=21.23)");
		System.out.println("float : "+v+" (char=a)");
		//System.out.println("float : "+w+" (boolean=true)");
		//System.out.println("float : "+x+" (String=hi)");

	}

}
