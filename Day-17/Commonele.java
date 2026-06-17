//TO find common elements in twp arrays
import java.util.Arrays;
public class Commonele {
    public static void main(String[] args) {
        int[] arr1 = {2,7,4,3,1};
        int[] arr2 = {5,7,8,1,9};
        Arrays.sort(arr1);   //time complexity O(n log n)----arr1=[1,2,3,4,7]
        Arrays.sort(arr2);   //time complexity O(n log n)----arr2=[1,5,7,8,9]
        for(int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println();
        for(int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        System.out.println("Common elements in both arrays:");
        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
