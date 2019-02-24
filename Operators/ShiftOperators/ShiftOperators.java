

public class ShiftOperators {

	public static void main(String[] args) {
		
		System.out.println("==Left-Shift Operator===");
		//first it convert binary format
		int a=8;//1000		//it add zeros in right side
				//100000.
		int r1=a<<2;// 100000-> 32
		System.out.println(r1);
		
		System.out.println("==Right-Shift Operator===");
		//first it convert binary format
		int b=6;//110			//it add zeros in left side
				//001.10
		int r2=b>>2;//001-> 1
		System.out.println(r2);
		//There is no "<<<" operator in Java
		//Unsigned Right shift operator (>>>) bit confusion on me
	}

}
