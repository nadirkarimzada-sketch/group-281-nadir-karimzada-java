package dog;

public class Dog {
  String name;
  String breed;
  int age;
  public Dog(String name, String breed, int age) {
	super();
	this.name = name;
	this.breed = breed;
	this.age = age;
  }
 
 public void bark () {
	 System.out.println("Grok");
 }
 
  public void introduce () {
	  System.out.println(name);
	  System.out.println(breed);
	  System.out.println(age);
  }
  
}
