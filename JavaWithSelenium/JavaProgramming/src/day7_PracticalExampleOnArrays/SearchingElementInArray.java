package day7_PracticalExampleOnArrays;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Search an element in an array(linear search)
		int a[] = {10, 20, 30, 40, 50};
		int search_ele = 70;
		boolean status= false;
		
		/*
		//normal for loop
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("Element found.");
				status = true; // if this block execute then status become true then we can say Element found.
				//if the above status is false then we can say this block is not executed then Elemetn not found.
				break; //as soon as found the element the loop no need to execute
			}
			//else //immediately we should not say element not found.  
				//after comparing all the element then only we have to say element not matching so 'else' block we should not keep here
				//if we put else block here and executed then we can get the output as "whatever the element not found" that is also executing.
		}
		
		if(status==false)
		{
			System.out.println("Element not found");
		}
		*/
	
		
		//for each
		for(int x:a)
		{
			if(x==search_ele)
			{
				System.out.println("Element found.");
				status = true;
				break;
			}
		}
		if(status ==false)
		{
			System.out.println("Element not found.");
		}
		
	}

}
