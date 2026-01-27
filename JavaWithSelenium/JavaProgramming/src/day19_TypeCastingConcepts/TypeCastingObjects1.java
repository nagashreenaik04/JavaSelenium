package day19_TypeCastingConcepts;

class Parent{
	String name ="John";
	void m1() {
		System.out.println("This is m1 from parent...");
	}
}

class Child extends Parent{
	int id =101;
	void m2() {
		System.out.println("This is m2 from child...");
	}
	
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c= new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		
		Parent p= new Child();//upcasting
		System.out.println(p.name);
		p.m1();
		//System.out.println(p.id); //we can't access
		//p.m2(); //we can't access because reference variable is parent. so we can access only from the parent.
		
		//Child c1= new Parent(); //downcasting
		Parent p1= new Parent(); 
		Child c1 = (Child) p1; //downcasting
		
		//Below we are getting the 'TypeCastingException' while performing the downcasting. compile time no error but while run time we will get the error.
		System.out.println(c1.name);
		System.out.println(c1.id);
		c1.m1();
		c1.m2();

	}

}
