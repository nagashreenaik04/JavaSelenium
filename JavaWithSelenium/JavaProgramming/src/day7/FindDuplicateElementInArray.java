package day7;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find Number of repeatations
		int a[] = {100, 200, 100, 300, 100, 400, 100};
		int num =100;
		int count=0;
		
		for(int value:a)
		{
			if(num==value)
			{
				count++;
			}
		}
		System.out.println(count); // 4
		

	}

}
