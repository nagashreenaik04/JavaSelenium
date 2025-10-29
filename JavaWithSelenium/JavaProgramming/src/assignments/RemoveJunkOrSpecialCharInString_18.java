package assignments;

public class RemoveJunkOrSpecialCharInString_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String s = "w$%^&^$#$%%^elcome";

        // Remove all special characters using regex
        String cleaned = s.replaceAll("[^a-zA-Z]", "");

        System.out.println("Original String: " + s);
        System.out.println("Cleaned String: " + cleaned);
        */
		
		String s = "w$%^&^$#$%%^elcome";
        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if character is a letter (a-z or A-Z)
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cleaned = cleaned + ch;
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("Cleaned String: " + cleaned);

	}

}
