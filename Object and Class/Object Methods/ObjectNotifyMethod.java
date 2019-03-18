

class Customer{  
	int amount=10000;  
	//withdraw method
	synchronized void withdraw(int amount){  
		System.out.println("Going to withdraw "+amount+"/-");  
  
		if(this.amount<amount){  
			System.out.println("Insufficient funds waiting for deposit.");  
			try{
				wait();
				}catch(Exception e){
					System.out.println("Withdraw Failed");
				}  
			}  
		this.amount-=amount;  
		System.out.println("Going to withdraw "+amount+"/-");  
		System.out.println("Withdraw completed!"); 
		System.out.println("Available Balance " + this.amount+"/-");
	}  
	//deposit method
	synchronized void deposit(int amount){  
		System.out.println("Going to deposit "+amount+"/-");  
		this.amount+=amount;  
		System.out.println("Available Balance " + this.amount+"/-");
		System.out.println("Deposit completed!\n");  
		notify();//notify to withdraw method  
		}  
}

public class ObjectNotifyMethod {

	public static void main(String[] args) {
		
Customer c=new Customer();  
		
		//withdrawing money
		new Thread(){  
		public void run(){
			c.withdraw(15000);
			}  
		}.start();  
		
		//depositing money
		new Thread(){  
			public void run(){
				c.deposit(10000);
				}  
		}.start();  


	}

}
/*Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened. */