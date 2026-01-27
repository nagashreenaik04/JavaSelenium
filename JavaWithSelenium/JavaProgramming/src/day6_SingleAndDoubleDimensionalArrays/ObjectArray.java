package day6_SingleAndDoubleDimensionalArrays; 

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//heterogenous variable then we will store in Object
		Object a[] = {100, 10.5 , 'A' , "Welcome" , true};
		
		//Normal for loop
		for(int i=0; i<=a.length-1; i++)
		{
			//System.out.println(i); //index number i.e., 0 1 2 3 4
			//System.out.println(a); // index address e.g., [Ljava.lang.Object;@5ca881b5
			System.out.println(a[i]);
		}
		
		//enhanced for loop/ for-each loop
		for(Object x: a)
		{
			System.out.println(x);
		}

	}

}
