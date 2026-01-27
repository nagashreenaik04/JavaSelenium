package day16_DataAbstractionJavaInterface;

interface Shape{
	int length = 10; //by default the variable is final and static 
	int width = 20; //static final
	
//	we can create a abstract methods
	void circle();
	
	static void rectangle()
	{
		System.out.println("Static methods are allowed.");
	}
	
//	default methods are allowed in interface.
	default void square()
	{
		System.out.println("This is square...");
	}
	
	
//	By default method always be a public so public methods are not allowed. make a default
//	void square()
//	{
//		
//	}
	
}

public class InterfaceDemo implements Shape{

	public void circle()
	{
		System.out.println("This is circle - abstarct method implemented here.");
	}
	
	void triangle()
	{
		System.out.println("this is triangle");
	}
	
	int x=100, y=200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scenario 1
		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle();
		idobj.square();
		Shape.rectangle(); //static method directly access from interface by entering the name of the interface.
		idobj.triangle();
		System.out.println(idobj.x + idobj.y); //300
		
		//Scenario 2
		//Shape s= new Shape(); //this is not possible. cannot instantiate the interface
		Shape s = new InterfaceDemo(); //but we can create the interface reference
		s.circle();
		s.square();
		Shape.rectangle();
		//s.triangle(); //this we can't access
		
		System.out.println(Shape.length * Shape.width); //accessing static variable directly
//		System.out.println(s.x + s.y); //we cannot access
		
		
		

	}

}
