package day6_SingleAndDoubleDimensionalArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring array
		
		//Approach 1
		//int a[][] = new int[3][2]; 
		//int [][]a = new int[3][2]; 
		int []a[] = new int[3][2]; 
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//Approach 2
		//int b[][] = {{100, 200}, {300, 400}, {500, 600}};
		int b[][] = {
						{100, 200}, 
						{300, 400}, 
						{500, 600}
					};
		
		//Find the size of array
		System.out.println("Length of rows : " + a.length); // Length of rows : 3
		System.out.println("Length of columns : " + a[0].length); // Length of columns : 2
		
		//read a single value/specific value from an array
		System.out.println(a[2][1]); // 600
		
		//reading all the values from array
		
		//normal for loop
		for(int r=0; r<=a.length-1; r++) // r<=2
		{
			//for(int c=0; c<=a[0].length-1; c++) // c<=1
			for(int c=0; c<=a[r].length-1; c++) // c<=1
			{
				System.out.print(a[r][c] + " "); //100 200 300 400 500 600
			}
			System.out.println();
		}
		
		//enhanced for loop / for..each loop
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x + " "); //100 200 300 400 500 600
			}
			System.out.println(); 
		}

	}

}
