//multiply maatrices
import java.util.Scanner;
public class Multiply{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows of matrix 1: ");
        int row1=sc.nextInt();
        System.out.println("enter no.of columns of matrix 1: ");
        int col1=sc.nextInt();
        System.out.println("enter no.of rows of matrix 2: ");
         int row2=sc.nextInt();
         System.out.println("enter no.of columns of matrix 2: ");
        int col2=sc.nextInt();
        System.out.println();
    if(col1!=row2){
        System.out.println("Matrix multiplication is not possible");
    }
    else{
        System.out.println("enter elements of matrix 1:--");
        int [][]matrix1=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
             matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of matrix 2:--");
        int[][]matrix2=new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
             matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix multiplication:");
        int[][]multiply=new int[row1][col1];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    multiply[i][j]+=matrix1[i][k]*matrix2[k][j];

                }
            }
        }
        for(int ele[]:multiply){
            for(int values:ele){
                System.out.print(values+" ");
            }
            System.out.println();
        }

    }
    }
}