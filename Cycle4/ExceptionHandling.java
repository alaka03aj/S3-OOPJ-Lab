/*
 * Write a Java program that shows the usage of try, catch, throws and finally.
 */

import java.util.Scanner;
public class ExceptionHandling {
    public static void array(int arr[], int n, int index, int num) throws ArrayIndexOutOfBoundsException{
        arr[index] = num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int n = s.nextInt();
        s.nextLine();
        int arr[] = new int[n];
        System.out.println("Enter index");
        int index = s.nextInt();
        s.nextLine();
        System.out.println("Enter value");
        int num = s.nextInt();
        s.nextLine();
        try{
            array(arr, n, index, num);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nEnd of program");
        }
        

    }
}
