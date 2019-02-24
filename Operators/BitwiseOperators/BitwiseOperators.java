

public class BitwiseOperators {

	public static void main(String[] args) {
		System.out.println("===BitWise AND Operator===");
		//first it convert binary format
		int a=12;//1100
		int b=10;//1010
				 //=====
				 //1000 ->8
		int r1=a&b;
		System.out.println(r1);
		
		System.out.println("===BitWise OR Operator===");
		//first it convert binary format
		int c=7;//111
		int d=4;//100
				//====
				//111 ->7
		int r2=c|d;
		System.out.println(r2);
		
		System.out.println("===Bitwise Complement Operator===");
		//first it convert binary format
		//1's complementary
		int e=5;//0101
				 //reverse
				 //=====
				 //1010 -> -6
		int r3=~e;
		System.out.println(r3);
		
		System.out.println("===Bitwise XOR Operator===");
		//first it convert binary format
		int f=6;//110  // 1 0 ->1 or 1 1->0
		int g=4;//100
				//====
				//010 ->2
		int r4=f^g;
		System.out.println(r4);
	}

}
