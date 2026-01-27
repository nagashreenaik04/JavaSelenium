package day17_WrapperClassesPackagesAccessModifiers;

public class DataConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// / String to Primitive type
		
		//String --> int
		//String s = "Welcome"; //cannot convert to int
		String s= "123";
		int sint = Integer.parseInt(s);
		System.out.println(sint);
		
		//String - Int
		String s1= "10";
		String s2=  "20";
		System.out.println(s1+s2); //1020
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //30
		
		//String - double
		String s3 = "10.5";
		String s4 = "20.1";
		System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));
		
		//String - boolean
		String s5= "true";
		String s6= "false";
		System.out.println(Boolean.parseBoolean(s5)); //true
		System.out.println(Boolean.parseBoolean(s6)); //false
		String sl= "selenium"; //other than true, if you pass any String that will return false
		System.out.println(Boolean.parseBoolean(sl)); //false
		
//		String to char is not possible
		
		
		// /Primitive datatype to String
		int a= 10;
		double d= 10.5;
		char c= 'A';
		boolean bool = true;
		
		String sc= String.valueOf(a);
		System.out.println(sc); //10
		sc=String.valueOf(d);
		System.out.println(sc); //10.5
		sc=String.valueOf(c);
		System.out.println(sc); //A //char to String is possible
		sc=String.valueOf(bool);
		System.out.println(sc); //true
	
		
		
		
		
		

	}

}
