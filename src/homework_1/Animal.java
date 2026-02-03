package homework_1;

public class Animal {
	String name;
	int age; 
	String breed;
	boolean playable; 
	
	public Animal (String name,  int  age, String breed) {
		
		this.name = name; 
		this.age = age;
		this.breed = breed;
	
		
	}
		
	public void eat() {
		System.out.println("Eat");
	}
	
	public void sleep() {
		
		System.out.println("Sleep");
		
	}
	
	

}
