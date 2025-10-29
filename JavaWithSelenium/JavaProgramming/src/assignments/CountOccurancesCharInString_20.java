package assignments;

public class CountOccurancesCharInString_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String s = "abbbbccddaabbdd";
        char[] ch = s.toCharArray();
        boolean[] visited = new boolean[ch.length]; // to mark counted characters

        System.out.println("Character counts:");
        for (int i = 0; i < ch.length; i++) {
            if (visited[i]) continue; // skip if already counted
            int count = 1;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch[i] + " = " + count);
            
        }
        */
		
		String s = "abbbbccddaabbdd";
        int[] count = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Print only non-zero counts
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println((char) i + " = " + count[i]);
            }
        }

	}

}
