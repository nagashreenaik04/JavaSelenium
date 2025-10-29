package day11_JavaMethodsAndConstructor;

public class Greetings {
	
	//1)No params   	No return value
	void m1()
	{
		System.out.println("Hello....."); //Hello.....
	}
	
	//2)No params  		return value
	String m2()
	{
		return("Hello how are you?");
	}
	
	//3)Takes params 		No return value
	void m3(String name)
	{
		System.out.println("Hello " + name); //Hello John
	}
	
	//4)Takes params 		return value
	String m4(String name)
	{
		return("Hello "+name);
	}

}
