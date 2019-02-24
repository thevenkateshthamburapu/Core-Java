

public class LocalVariable {
	
	public void putAge()

    {
        int age = 0; //local variable
        age = age + 6;
        System.out.println("Dog age is : " + age);
    }

	public static void main(String[] args) {
		LocalVariable lv=new LocalVariable();
		lv.putAge();
		System.out.println("================");
		for(int i=0;i<=10;i++){//local variable-> int i
			System.out.println(i);
		}
		
	}

}
