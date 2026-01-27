package day18_ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;
		
		try {
			System.out.println(s.length());
		}
//		catch(NullPointerException e) {
//			System.out.println("catch block handled exception...");
//			System.out.println(e.getMessage());
//		}
		catch(NumberFormatException e) {
			System.out.println("catch block cannot handled exception...");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("You entered into Finally block...");
		}
		
		
		s="Welcome";
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block handled exception...");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("You entered into Finally block...");
		}
		
		System.out.println("Program finished...");
		
		

	}

}
