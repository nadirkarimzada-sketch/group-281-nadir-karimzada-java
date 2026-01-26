package Extra_homework;

public class Extra_homework {
	class Account {
	    private String owner;
	    private double balance;

	    public Account(String owner, double balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance = amount;
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Недостаточно средств");
	        } else {
	            balance -= amount;
	        }
	    }

	  
	}
	
	
	class Rectangle {
	    double width;
	    double height;

	    Rectangle(double w, double h) {
	        width = w;
	        height = h;
	    }

	    double area() {
	        return width * height;
	    }

	    Rectangle scale(double factor) {
	        return new Rectangle(width * factor, height * factor);
	    }
	    
	    class Rectangle {
	        double width;
	        double height;

	        Rectangle(double w, double h) {
	            width = w;
	            height = h;
	        }

	        double area() {
	            return width * height;
	        }

	        Rectangle scale(double factor) {
	            return new Rectangle(width * factor, height * factor);
	}
}
