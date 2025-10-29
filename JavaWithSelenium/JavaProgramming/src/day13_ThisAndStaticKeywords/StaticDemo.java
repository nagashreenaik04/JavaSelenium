package day13_ThisAndStaticKeywords;

public class StaticDemo {

	static int a=10; //Static variable
	int b=20; //non static variable
	
	static void m1()
	{
		System.out.println("This is a static method...");
	}
	
	void m2()
	{
		System.out.println("This is a non-static method...");
	}
	
	void m() //non-static method
	{
		//3)Non-static method can access everything directly.
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Static method can access static stuff directly (without object)
		System.out.println(a); //10
		m1(); // This is a static method...
		
		//System.out.println(b); //cannot make a static reference to the non-static field b
		//m2(); //cannot make a static reference to the non-static method m2() from the type StaticDemo
		
		//2)static method can access non-static stuff through object
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b); //20
		sd.m2(); //This is a non-static method...
		
		sd.m();

	}
	*/

}
