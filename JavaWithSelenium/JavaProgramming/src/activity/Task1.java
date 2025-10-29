package activity;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
		for(int i = 0; i < 3; i++) {
		    for(int j = 0; j < 2; j++) {
		        if(i == j) break;
		        System.out.print(i + "" + j + " ");
		    }
		}
		// 10 20 21
		
		System.out.println();
		
		// 2.
		System.out.println("Result: " + 2 + 3 * 4); // Result: 212
		
		
		// 3.
		int a = 5;
		int b = a++ + ++a;
		System.out.println(a + " " + b); // 7 12
		
		// 4.
		String s1 = "Java";
		String s2 = "Ja" + "va";
		System.out.println(s1 == s2); //true
		
		// 5. 
		int x = 1;
		x = x++ + ++x + x++;
		System.out.println(x); //7
		
		// 6. 
		System.out.println(5 + 3 + "Java" + 2 + 1); // 8Java21
		
		//7.
		int[] arr = {1, 2, 3};
		for(int i = 0; i < arr.length; i++) {
		    if(i == 1) continue;
		    System.out.print(arr[i]);
		}
		//opt: 13
		
		System.out.println();
		
		// 8.
		int xy = 5;
		System.out.println(xy-- - --xy); //2
		
		// 9.
		int d = 10;
		int e = 20;
		int c = a > b ? d : e;
		System.out.println(c); //20

		
		
		

	}

}
