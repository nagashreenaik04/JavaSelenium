package day6_SingleAndDoubleDimensionalArrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring array
		
		//Approach 1
		//int a[]= new int[5];
		int []a= new int[5];
		
		//add value into the array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Approach 2
		//declare and assign data in a single line
		int b[]= {100, 200, 300, 400, 500};
		
		//Find length of an array
		System.out.println("Length of an array is : " + b.length); //Length of an array is : 5
		 
		//read single value from an array
		System.out.println(a[4]);  //500
		
		//reading all the values from array
		
		//Normal for loop
		//for(int i=0; i<length; i++) // i<5
		
		for(int i=0; i<=a.length-1; i++) // i<=4
		{
			System.out.println(a[i]); //100 200 300 400 500
		}
		
		
		//enhanced for loop / for..each loop
		for(int x:a)
		{
			System.out.println(x); //100 200 300 400 500
		}

	}

}
