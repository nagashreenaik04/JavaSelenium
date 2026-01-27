package day19_TypeCastingConcepts;


//Upcasting - converting value from smaller - larger
//downcasting - converting value from larger - smaller
public class TypeCastingConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting -automatic ------ smaller - larger
		int intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		float floatvalue = 10.5F;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//downcasting - manually ----- larger-smaller
		long longvalue1 = 10000L;
		int intvalue1 = (int)longvalue1;
		System.out.println(intvalue1);
		
		double doublevalue1 = 125.55D;
		float floatvalue1 = (float) doublevalue1;
		//float floatvalue1 = doublevalue1(float); //we can't specify like this
		System.out.println(floatvalue1);
		
		//Example 1
		int i=100;
		double d=i; //upcasting
		System.out.println(d); //100.0
		
		//Example 2
		double d1=10.5D;
		int i1=(int)d1; //downcasting
		System.out.println(i1); //10
		

	}

}
