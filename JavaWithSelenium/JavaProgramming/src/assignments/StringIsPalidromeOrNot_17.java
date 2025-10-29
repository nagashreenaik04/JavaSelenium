package assignments;

public class StringIsPalidromeOrNot_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "MADAM";
		//String s= "Welcome";
		String replace="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			replace = replace + s.charAt(i);
		}
		System.out.println("Replace String is : " + replace);
		
		if(s.equals(replace))
			System.out.println(s + " is a Palindrome");
		else
			System.out.println(s + "is not a Palindrome");

	}

}
