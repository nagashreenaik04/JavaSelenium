package day12_PolymorphismAndEncapsulation;

public class Adder {
	
	
	//Method Overloading - same method in the various way
	int x=10, y=20;
	
	//1)No parameters
	void sum()
	{
		System.out.println(x+y);
	}
	
	//We should not consider return type changing as overloading part. then also it is consider as a same method.
	//if we change the return type then we can't consider the method are changed both 1 and this method are same
	/*int sum() //Duplicate method sum() in type Adder
	{
		return(x+y);
	}
	*/
	
	//2)parameterized
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	//3)datatype of parameter are different
	void sum(int a, double b)
	{
		System.out.println(a+b);
	}
	
	//4)order of datyptype is different
	void sum(double a, int b)
	{
		System.out.println(a+b);
	}
	
	//5)number of parameter are different
	void sum(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}

}
