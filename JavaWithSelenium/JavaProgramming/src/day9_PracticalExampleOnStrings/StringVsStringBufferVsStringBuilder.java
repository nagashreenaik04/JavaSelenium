package day9_PracticalExampleOnStrings;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String - immutable 
		String s="Welcome ";
		s.concat("to java");
		System.out.println(s); //Welcome --> Immutable, cannot change original value of s
		
		//String Buffer - mutable
		StringBuffer sb1=new StringBuffer("Welcome ");
		sb1.append("to java");
		System.out.println(sb1); //Welcome to java --> mutable, we can change original value of s
		
		//StringBuilder - mutable
		StringBuilder sb2=new StringBuilder("Welcome ");
		sb2.append("to java"); //append() is similar to the concat()
		System.out.println(sb2); //Welcome to java --> mutable, we can change original value of s
		

	}

}
