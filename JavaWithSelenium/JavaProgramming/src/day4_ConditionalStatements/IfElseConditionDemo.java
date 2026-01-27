package day4_ConditionalStatements;

public class IfElseConditionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int person_age = 15;
		
		/*
		if(person_age>=18)
		{
			System.out.println("Eligible for vote.");
		}
		else
		{
			System.out.println("Not eligible for vote.");
		}
		*/
		if(person_age>=18)
			System.out.println("Eligible for vote."); //when we have only one statement then we can use without curly braces
	
		else
			System.out.println("Not eligible for vote.");
		
		

	}

}
