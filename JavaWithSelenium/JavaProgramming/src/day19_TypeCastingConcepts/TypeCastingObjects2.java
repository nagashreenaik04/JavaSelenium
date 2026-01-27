package day19_TypeCastingConcepts;

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObjects2 {
	
	public static void main(String args[]) {
		
		//Cat ct= (Cat) an;
		//a b= c d;
		
		//Rule 1: Conversion is valid or not
		//The type of Object 'Cat'[c] and variable 'an' must have some relationship(either parent to child or child to parent)
		Animal an= new Dog();
		//Cat ct= (Cat) an; //valid as per rule 1
		
		Dog dg =new Dog();
		//Cat ct1 = (Cat) dg; //conversion in not valid as per rule 1
		
		//Rule 2: Assignment is valid or not.
		// Object 'Cat'[c] must be either same or child of Object of 'Cat' [a]
		Animal an1= new Dog();
		//Cat ct1 = (Cat) an; //valid as per rule 2
		
		//Cat ct2 = (Dog) an1; //rule 1 is valid but invalid as per rule 2.
		
		//Rule 3:
		//The underlying object of type of variable 'd' i.e., [Object Dog] must be either same or child of 'c' i.e., [Object Cat]
		Animal an2 = new Dog();
		//Cat ct2 = (Cat) an; //invalid as per rule 3. // here we will get the run time error
		//[Exception in thread "main" java.lang.ClassCastException: class day19_TypeCastingConcepts.Dog cannot be cast to class day19_TypeCastingConcepts.Cat (day19_TypeCastingConcepts.Dog and day19_TypeCastingConcepts.Cat are in unnamed module of loader 'app')
		// at day19_TypeCastingConcepts.TypeCastingObjects2.main(TypeCastingObjects2.java:18)]
		
		//Rule 1, Rule 2 and Rule 3
		Animal an3 =new Dog();
		Dog dg1 = (Dog) an3; // All 3 rules are valid
		
	}

}
