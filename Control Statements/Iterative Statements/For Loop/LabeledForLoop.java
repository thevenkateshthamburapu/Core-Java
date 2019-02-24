

public class LabeledForLoop {

	public static void main(String[] args) {
		System.out.println("==Unlabeled For loop===");
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==3)
					break;//unlabeled
				System.out.print("* ");
			}
			System.out.println();
			//in this it skip the 3rd statement remaining executed
		}
		
		System.out.println("==Labeled For loop===");
		venky:
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==3)
					break venky;//labeled
				System.out.print("* ");
			}
			System.out.println();
			//in this it stop the execution
		}
	}

}
