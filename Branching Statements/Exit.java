

public class Exit {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++){
			if(i>5){
				System.out.println("Exit.....!");
				System.exit(0);//terminates the JVM
			}
			System.out.println(i);
		}
		System.out.println("End of Program......");//not executed after exit
	}

}
