//TO find maximum frequency element in an array
import java.util.*;
public class MaxFreqElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        findMaxFreqElement(arr);
    }
    public static void findMaxFreqElement(int[] arr) {
        int maxFreq = 0;
        int maxFreqElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxFreq) {
                maxFreq = count;
                maxFreqElement = arr[i];
            }
            else if (count == maxFreq && arr[i]>maxFreqElement) {
                maxFreqElement = arr[i];
            }

        
}
        System.out.println("The maximum frequency element is: " + maxFreqElement + " with frequency: " + maxFreq);
}
}
    