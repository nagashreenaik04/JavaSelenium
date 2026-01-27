package day17_WrapperClassesPackagesAccessModifiers.subpackage2;

import day17_WrapperClassesPackagesAccessModifiers.subpackage1.Test1;

public class Test4 {
	
	public static void main(String args[])
	{
		Test1 t1 = new Test1();
		System.out.println(t1.w); //300 //we can access because public
		t1.m4();
	}

}
