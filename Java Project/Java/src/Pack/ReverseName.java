package Pack;

public class ReverseName {
	 
	public static void main(String[] args) {
		String name = "Shree";
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println(name + " reverse is " + reverse);
	}

}
