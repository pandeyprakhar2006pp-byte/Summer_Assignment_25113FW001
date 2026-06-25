//Write a program to Sort names alphabatically

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Prakhar", "Aman", "Rohit", "Vikas", "Deepak"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

 //Method 2: By Inbuilt function use

// import java.util.Arrays;

// public class SortNames {
//     public static void main(String[] args) {
//         String[] names = {"Prakhar", "Aman", "Rohit", "Vikas", "Deepak"};

//         Arrays.sort(names);

//         System.out.println("Names in Alphabetical Order:");
//         for (int i = 0; i < names.length; i++) {
//             System.out.println(names[i]);
//         }
//     }
// }