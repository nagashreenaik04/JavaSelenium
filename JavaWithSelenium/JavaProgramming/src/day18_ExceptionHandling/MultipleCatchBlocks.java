package day18_ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program started...");
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException e){
			System.out.println("Handled Exception...");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Handled Exception...");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Handled Exception...");
			System.out.println(e.getMessage());
		}
		
		//After using this we have some problems that is:
		//1.if the exception is other than this above 3 then still we will get the error.
		//2.After using multiple catch block the length of the code will be increased unnessarily 
		// To Overcome this problem we have a one solution that is using the only one catch block that is 'Exception' to handle all the exceptions.
		catch(Exception e) {
			System.out.println("Handled Exception...");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program completed...");
	}

}
