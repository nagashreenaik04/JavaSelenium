package assignments;

public class FindMissingNumber_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Find Missing Number.
		int[] a = {1, 3, 4, 5};
		int n = 5; // Range from 1 to 5//numbers should be in range
		//numbers should be in range, should not have duplicates
		
		
		int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        
        for (int num : a) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
        */
		
		 int[] a = {1, 3, 4, 5};

	     // Find min and max from the array
	     int min = a[0];
	     int max = a[0];
	     int actualSum = 0;

	     for (int num : a)
	     {
	        if (num < min) min = num;
	        if (num > max) max = num;
	        actualSum += num;
	     }

	     // Sum of numbers in the range [min, max]
	     int expectedSum = 0;
	     for (int i = min; i <= max; i++) {
	         expectedSum += i;
         }

	     int missingNumber = expectedSum - actualSum;
	     System.out.println("Missing number is: " + missingNumber);
	     
		
		
		//checking the duplicate number also
		/*
		int[] a = {1, 3, 4, 5, 3,4};
        int n = 5; // Range 1 to 5

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        int duplicate = -1;

        // Find duplicate and actual sum
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate = a[i];
                }
            }
        }

        int missing = expectedSum - (actualSum - duplicate);

        System.out.println("Missing number is: " + missing);
        if (duplicate != -1)
            System.out.println("Duplicate number is: " + duplicate);
        else
            System.out.println("No duplicate number.");
            
        */

	}

}
