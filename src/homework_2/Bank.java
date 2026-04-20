package homework_2;

public class Bank {
	public static void main(String[] args) {
		public class Bank {
		    private static Bank instance;
		    private int balance = 0;
		    
		    private Bank() {}
		    
		    public static Bank getInstance() {
		        if (instance == null) {
		            instance = new Bank();
		        }
		        return instance;
		        
		    }
		    public void deposit(int amount) { balance += amount; }
		    public int getBalance() { return balance; }
		   
		}
	}

}
