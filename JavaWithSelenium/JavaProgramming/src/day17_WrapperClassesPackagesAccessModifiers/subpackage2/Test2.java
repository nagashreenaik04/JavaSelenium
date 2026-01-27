package day17_WrapperClassesPackagesAccessModifiers.subpackage2;

import day17_WrapperClassesPackagesAccessModifiers.subpackage1.Test1;

public class Test2 extends Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t1= new Test1();
		//System.out.println(t1.x); // we cannot access because x variable is private
		//t1.m1(); // we cannot access because m1() is private
		
		
		//import the package
		//System.out.println(t1.y);   // we cannot access because y variable is default
		//t1.m2();  // we cannot access because m2() is default
		
		
		//System.out.println(t1.z);   // we cannot access by parent class
		//t1.m3();  // we cannot access by parent object reference
		
		//we have to make inheritence
		Test2 t2= new Test2();//we can access by child class when the element is protected
		System.out.println(t2.z);
		t2.m3();
	}

}
