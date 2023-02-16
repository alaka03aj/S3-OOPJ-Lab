/*
Program 3: Write a Java program to multiply two given matrices.
 */
import java.util.Scanner;
public class matrixMult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row1, col1, row2, col2;

        //Input dimensions of first matrix: A
        System.out.print("Enter number of rows in first matrix: ");
        row1 = s.nextInt();

        System.out.print("Enter number of columns in first matrix: ");
        col1 = s.nextInt();

        // Input dimensions of second matrix: B
        System.out.print("Enter number of rows in second matrix: ");
        row2 = s.nextInt();

        System.out.print("Enter number of columns in second matrix: ");
        col2 = s.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];

        System.out.println("\nEnter values for matrix A : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) 
                a[i][j] = s.nextInt();
        }

        System.out.println("\nEnter values for matrix B : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) 
                b[i][j] = s.nextInt();
        }

        System.out.println("Matrix multiplication:");

        for(int i=0; i<row1; i++){
            for (int j=0; j<col2; j++){
                c[i][j] = 0;
                for (int k=0; k<col1; k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }  
    }

    
}