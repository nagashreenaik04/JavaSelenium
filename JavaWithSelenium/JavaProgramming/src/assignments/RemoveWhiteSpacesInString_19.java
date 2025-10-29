package assignments;

public class RemoveWhiteSpacesInString_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "we l co m e";
		
		/*
		// Remove all spaces
        String noSpace = s.replace(" ", "");

        System.out.println("Original String: " + s);
        System.out.println("String without spaces: " + noSpace);
        */
		
		String noSpace = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Add only non-space characters
            if (ch != ' ') {
                noSpace = noSpace + ch;
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("String without spaces: " + noSpace);        
		

	}

}
