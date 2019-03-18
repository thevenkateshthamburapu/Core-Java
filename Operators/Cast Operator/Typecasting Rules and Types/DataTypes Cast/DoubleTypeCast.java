

public class DoubleTypeCast {

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
		
		double p=a;//byte ->gain decimal point
		double q=b;//short ->gain decimal point
		double r=c;//int ->gain decimal point
		double s=d;//long ->gain or loss decimal point
		double t=e;//float
		double u=f;//double
		double v=g;//char ->gain decimal point
		//double w=h;//boolean C.E->Type mismatch: cannot convert from boolean to double
		//double x=i;//String C.E->Type mismatch: cannot convert from String to double
		System.out.println("double : "+p+" (byte=10)");
		System.out.println("double : "+q+" (short=25)");
		System.out.println("double : "+r+" (int=15)");
		System.out.println("double : "+s+" (long=15639465l)");
		System.out.println("double : "+t+" (float=12.58f)");
		System.out.println("double : "+u+" (double=21.23)");
		System.out.println("double : "+v+" (char=a)");
		//System.out.println("double : "+w+" (boolean=true)");
		//System.out.println("double : "+x+" (String=hi)");


	}

}
