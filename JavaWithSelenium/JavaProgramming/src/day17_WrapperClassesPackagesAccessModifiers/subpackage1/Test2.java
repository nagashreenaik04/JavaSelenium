package day17_WrapperClassesPackagesAccessModifiers.subpackage1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1= new Test1();
		//System.out.println(t1.x); // we cannot access because x variable is private
		//t1.m1(); // we cannot access because x variable is private
		
		System.out.println(t1.y); //100 because default variable
		t1.m2(); 
		
		System.out.println(t1.z); //200 because protected variable of this package
		t1.m3(); 
		
		System.out.println(t1.w); //300 because public variable of this package
		t1.m4(); 

	}

}
