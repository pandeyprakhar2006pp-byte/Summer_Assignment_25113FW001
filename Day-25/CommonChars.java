//WAP to find common characters in a strings
import java.util.*;

public class CommonChars {

    public static void findCommonChars(String str) {
        int freq[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Common characters are:");

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        findCommonChars(str);
    }
}