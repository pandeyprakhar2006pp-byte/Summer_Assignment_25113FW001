//WAP to check palindrome string.
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";  // You can change this string to test
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;  // Not a palindrome
            }
            i++;
            j--;
        }
        return true;  // Palindrome
    }
}
