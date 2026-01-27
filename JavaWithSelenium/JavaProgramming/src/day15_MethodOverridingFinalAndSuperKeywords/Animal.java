package day15_MethodOverridingFinalAndSuperKeywords;

public class Animal {
	
	String color = "White";
	
	void eat() {
		System.out.println("Eating...");
	}

}

class Dog extends Animal
{
	String color="Black";
	
	void displayColor()
	{
		System.out.println(color);//Black
		//After overriding also, i want to get my old value
		System.out.println(super.color);//White
	}
	
	void eat()
	{
		System.out.println("Eating a bread...");
		super.eat();
	}
}
