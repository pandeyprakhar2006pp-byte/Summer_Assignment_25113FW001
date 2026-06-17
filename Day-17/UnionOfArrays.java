//Union of arrays
import java.util.*;
public class UnionOfArrays {
    public static void main(String[] args) {
      
        int a[] = {1, 2, 4, 5};
        int b[] = {2, 3, 5, 6};
        union(a, b);
    }
    public static void union(int a[], int b[]) {
        int i=0, j=0;
        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i] > b[j]) {
                System.out.print(b[j]+" ");
                j++;
            } 
            else {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<a.length) {
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<b.length) {
            System.out.print(b[j]+" ");
            j++;
        }
        
    }
}

       
