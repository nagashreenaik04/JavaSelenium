package assignments;

public class LowestNumberInArray_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,5,6,8,2};
		int low=a[0];
		
		for(int x:a)
		{
			if(x<low)
			{
				low=x;
			}
		}
		System.out.println("Lowest Number in array is : " + low);

	}

}
