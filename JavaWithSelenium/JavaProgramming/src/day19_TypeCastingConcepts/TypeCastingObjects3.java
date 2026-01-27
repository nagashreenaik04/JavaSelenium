package day19_TypeCastingConcepts;

public class TypeCastingObjects3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EX1
		Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;//rule 1 & 2 is valid. but rule 3 is invalid.
		
		//EX2
		String s = new String("welcome");
		//StringBuffer sb = (StringBuffer) s; //rule 1 is valid
		
		//EX3
		Object o1 = new String("welcome");
		//StringBuffer sb= (String) o1; //rule 1 is valid but rule 2 is invalid.
		
		//EX4
		String s1 = new String("welcome");
		//StringBuffer sb= (String) s1; //rule 1 is valid but rule 2 is invlid.
		
		//EX5
		Object o2 = new String("welcome");
		String s2 = (String) o2; //rule 1,2 and 3 are valid.
		System.out.println(s2); //welcome
		
	}

}
