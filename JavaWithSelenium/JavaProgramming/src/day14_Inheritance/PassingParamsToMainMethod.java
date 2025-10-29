package day14_Inheritance;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to pass parameters to the main method?
		
		//System.out.println("Testing.....");
		System.out.println(args.length);
		
		for(String value: args)
		{
			System.out.println(value);
		}

	}

}
