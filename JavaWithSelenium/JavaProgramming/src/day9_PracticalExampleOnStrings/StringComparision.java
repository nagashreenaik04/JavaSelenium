package day9_PracticalExampleOnStrings;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Case 1
		String s1= "Welcome";
		String s2= "Welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Case 2
		String a1=new String("Welcome");
		String a2=new String("Welcome");
		System.out.println(a1==a2); //false // to compare the objects
		System.out.println(a1.equals(a2)); //true // to compare the values of objects
		
		//Case 3
		String b1="abc";
		String b2=new String("abc");
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		
		//Case 4
		String c1="abc";
		String c2=new String("abc");
		String c3=c2;
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c2==c3); //true, because objects are same/equal
		System.out.println(c2.equals(c3)); //true
		System.out.println(c1==c3); //false
		System.out.println(c1.equals(c3)); //true

	}

}
