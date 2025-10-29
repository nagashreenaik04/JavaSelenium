package day9_PracticalExampleOnStrings;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mutable can change
		int a[] = {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); //mutable
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s=new String("Welcome ");
		System.out.println(s); //Welcome
		s.concat("to java");
		System.out.println(s); //Welcome    ---> immutable - we cannot change
		String concatString = s.concat("to java");
		System.out.println(concatString); //Welcome to java

	}

}
