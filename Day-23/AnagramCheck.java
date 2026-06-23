  /*WAP to check anagram strings--
Two strings are anagrams -
if they contain the same characters with the same frequency, just in a different order.
Eg- listen and silent */

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
    }
}

    

