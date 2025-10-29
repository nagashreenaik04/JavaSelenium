package day13_ThisAndStaticKeywords;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Static method can access static stuff directly (without object)
		//System.out.println(a); //a cannot be resolved to a variable
		System.out.println(StaticDemo.a); //10
		//m1(); //The method m1() is undefined for the type StaticMain
		StaticDemo.m1(); // This is a static method...
		
		//System.out.println(b); //cannot make a static reference to the non-static field b
		//m2(); //cannot make a static reference to the non-static method m2() from the type StaticDemo
		
		//2)static method can access non-static stuff through object
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b); //20
		sd.m2(); //This is a non-static method...
		
		sd.m();

	}

}
