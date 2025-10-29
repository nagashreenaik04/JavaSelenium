package assignments;

public class CountWordsInAString_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String s = "Welcome to java selenium";

        // Split by spaces
        String[] words = s.split(" ");

        System.out.println("Count of words = " + words.length);
        */
		
        /*
        String s = "  Welcome   to   java   selenium  ";

        // Remove leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        System.out.println("Count of words = " + words.length);
        */
		
		//Without using split()
		String s = "Welcome to java selenium";
        int count = 1; // start with 1 word

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        System.out.println("Count of words = " + count);

	}

}
