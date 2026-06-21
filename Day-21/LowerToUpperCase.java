//Wap to convert lowercase to uppercase using inbuilt function.
// import java.util.Scanner;
// public class LowerToUpperCase {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//          System.out.println("Uppercase: " + str.toUpperCase());
//     }
// }


// Method-2: Without toUppeerCase() method

import java.util.Scanner;

public class LowerToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        System.out.println(result);
    }
}