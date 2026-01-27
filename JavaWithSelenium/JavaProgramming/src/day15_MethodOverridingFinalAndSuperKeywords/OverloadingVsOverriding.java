package day15_MethodOverridingFinalAndSuperKeywords;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	//overriding we can achieve only with the inheritance
	void m1(int a) //overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b) //overloading
	{
		System.out.println(a+b);
	}
	
	void m2(int b)
	{
		System.out.println(b*b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xyzobj= new XYZ();
		xyzobj.m1(10); //100
		xyzobj.m2(20); //400
		xyzobj.m2(10, 20); //30

	}

}
