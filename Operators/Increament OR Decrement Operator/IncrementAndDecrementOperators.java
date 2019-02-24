

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int m=8,n=9;
		/*n=n+m;
		System.out.println(n);*/
		
		//or
		
		n+=m;
		System.out.println(n);
		
		System.out.println("========Increment=========\n");
		int a=5;
		System.out.println("Initail value ="+a);
		int b=++a;//pre increment
		/*pre increment means first increment then assign  */
		System.out.println("==Pre Increment===");
		System.out.println(b);
		int c=4;
		System.out.println("Initail value ="+c);
		int d=c++;//post increament
		/*post increament means first assign then increment   */
		System.out.println("==Post Increament===");
		System.out.println(d);
		
		System.out.println("\n=======Decrement========\n");
		int e=8;
		System.out.println("Initail value ="+e);
		int f=--e;//pre decrement
		/*pre decrement means first decrement then assign  */
		System.out.println("==Pre Decrement===");
		System.out.println(f);
		int g=15;
		System.out.println("Initail value ="+g);
		int h=g--;//post decreament
		/*post decreament means first assign then decrement   */
		System.out.println("==Post Decreament===");
		System.out.println(h);
		
		System.out.println();
		int i=10;
		i--;//--i;//i++;//++i
		System.out.println(i);
	}

}
//it is also called as Unary Operators