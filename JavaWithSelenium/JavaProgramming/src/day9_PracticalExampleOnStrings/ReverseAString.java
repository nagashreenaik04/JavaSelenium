package day9_PracticalExampleOnStrings;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s= "Welcome";
		String rev="";
		
		//Approach 1 - with using charAt() , length()
		for(int i=s.length()-1; i>=0; i--)
		{
			//System.out.print("Reverse String is : " + s.charAt(i));
			rev+=s.charAt(i); //rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is : " + rev);
		
		//Approach 2 - to converting String to char array type
		rev="";
		char a[]=s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			//System.out.print(a[i]);
			rev+=a[i]; //rev=rev+a[i];
		}
		System.out.println("Reverse String is : " + rev);
		
		//Approach 3 - using String Buffer class
		//StringBuffer s=new StringBuffer("Welcome"); //Duplicate local variable
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println(sb); //Welcome
		System.out.println("Reverse String is : " + sb.reverse()); //Reverse String is : emocleW
		
		//Approach 3 - using String Builder class
		//StringBuffer s=new StringBuffer("Welcome"); //Duplicate local variable
		StringBuilder sb1 = new StringBuilder("Welcome");
		System.out.println(sb1); //Welcome
		System.out.println("Reverse String is : " + sb1.reverse()); //Reverse String is : emocleW
				

	}

}
