//Intersection of Two Arrays
import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        int b[] = {2, 3, 5, 6};
        intersection(a, b);
    }
    public static void intersection(int a[], int b[]) {
        int i=0, j=0;
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) {
                i++;
            }
            else if(a[i] > b[j]) {
                j++;
            } 
            else {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}