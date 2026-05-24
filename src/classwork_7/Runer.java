package classwork_7;

public class Runer {
	
	class Animal {
	    String name;
	    String sound;
	}

	public class Main {
	    public static void main(String[] args) {
	        Animal cat = new Animal();

	        cat.name = "Кот";
	        cat.sound = "мяу";

	        System.out.println(cat.name + " говорит: " + cat.sound);
	    }
	}
	

}
