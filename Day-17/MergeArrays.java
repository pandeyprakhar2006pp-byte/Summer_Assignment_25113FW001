//To merge Arrays
import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {1, 4, 6, 8};
        int mergedArray[] =merge(arr1, arr2);
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] merge(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedArray[] = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int j = 0; j < n2; j++) {
            mergedArray[n1 + j] = arr2[j];
        }
        return mergedArray;
    }
}