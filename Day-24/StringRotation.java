//Wap to check string rotation
/*A string s1 is rotation of s2 if s2 is rotated and s1 obtains */

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("String is a rotation");
        } else {
            System.out.println("String is not a rotation");
        }
    }
}