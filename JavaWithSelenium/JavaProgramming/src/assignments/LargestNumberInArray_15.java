package assignments;

public class LargestNumberInArray_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,5,6,8,2};
		int lar=a[0];
		
		for(int x:a)
		{
			if(x>lar) 
			{
				lar=x;
			}
		}
		System.out.println("Largest Number in array is : "+ lar);

	}

}
