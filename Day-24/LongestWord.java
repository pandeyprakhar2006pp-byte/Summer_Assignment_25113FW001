//WAP to find longest word.

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java is a powerful programming language";

        String curr = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                curr += ch;
            } else {
                if (curr.length() > longest.length()) {
                    longest = curr;
                }
                curr = "";
            }
        }

        // Check the last word
        if (curr.length() > longest.length()) {
            longest = curr;
        }

        System.out.println("Longest Word = " + longest);
    }
}