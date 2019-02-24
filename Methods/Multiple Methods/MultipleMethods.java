

import java.util.Scanner;

public class MultipleMethods {
	
	int a;
	int b;
	public void add(){
		System.out.println("Result:"+(a+b));
	}
	public void sub(){
		System.out.println("Result:"+(a-b));
	}
	public void mul(){
		System.out.println("Result:"+(a*b));
	}
	public void div(){
		System.out.println("Result:"+(a/b));
	}
	public void mod(){
		System.out.println("Result:"+(a%b));
	}
	
	public static void main(String[] args) {
		
		MultipleMethods m=new MultipleMethods();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number-1 value");
		m.a=scan.nextInt();
		System.out.println("Enter the Number-2 value");
		m.b=scan.nextInt();
		System.out.println("====Enter Choice======");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modular Division");
		int choice=scan.nextInt();
		switch(choice){
		case 1:m.add();
		break;
		case 2:m.sub();
		break;
		case 3:m.mul();
		break;
		case 4:m.div();
		break;
		case 5:m.mod();
		break;
		default :System.out.println("Please Enter your choice");
		}
	}
}
