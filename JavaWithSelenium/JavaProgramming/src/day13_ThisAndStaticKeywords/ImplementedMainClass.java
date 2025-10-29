package day13_ThisAndStaticKeywords;

public class ImplementedMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test.s.length(); //Here we are calling the s variable from the 'Test' class. Now we are calling the length() from the 'String' class.
		System.out.println(); //Here we are calling the out variable from the 'System' class. Now we are calling println() from the 'PrintStream' class.
		System.out.print(""); //Here we are calling the out variable from the 'System' class. Now we are calling print() from the 'PrintStream' class.

	}

}
