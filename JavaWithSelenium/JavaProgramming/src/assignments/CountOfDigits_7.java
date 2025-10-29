package assignments;

public class CountOfDigits_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=423424;
		int o_n=n;
		int i=0;
		
		while(n>0)
		{
			n/=10;
			i++;
		}
		System.out.println("Count of digit " + o_n + " is " + i);

	}

}
