package day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {100, 600, 200, 400, 500};
		System.out.println("Before sorting....");
		/*
		for(int x:a)
		{
			System.out.println(x);
		}
		*/
		System.out.println(Arrays.toString(a)); // [100, 600, 200, 400, 500]
		
		Arrays.sort(a); //sort elements in array
		
		System.out.println("After sorting....");
		System.out.println(Arrays.toString(a)); // [100, 200, 400, 500, 600]
		
	}

}
