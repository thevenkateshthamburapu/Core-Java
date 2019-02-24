

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(19);
		al.add(20);
		al.add(21);
		al.add(22);
		al.add(23);
		al.add(24);
		al.add(25);
		
		//using lambda expression
		al.forEach(p->{
			System.out.println(p);
		});
		
	}

}
//it comes into arrays and collections