package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"D","C","B","A"};
		System.out.println("Before sorting..." + Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting..." + Arrays.toString(s));
		
		String a[] = {"Scot", "Marry", "John", "David"};
		System.out.println("Before sorting..." + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting..." + Arrays.toString(a));
		

	}

}
