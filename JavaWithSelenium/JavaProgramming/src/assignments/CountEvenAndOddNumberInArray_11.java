package assignments;

public class CountEvenAndOddNumberInArray_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7};
		int even =0;
		int odd =0;
		
		for(int x:a)
		{
			if(x%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even number in array is : " + even);
		System.out.println("Odd number in array is : " + odd);

	}

}
