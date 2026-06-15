//Move zeros to end-Concept: Bubble Sort
import java.util.*;
public class Movezerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr);
    }
    
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-1-i;j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Array after moving zeros to the end:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
                