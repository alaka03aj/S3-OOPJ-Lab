/*
 * Write a Java program that implements the binary search algorithm.
 */

import java.util.Scanner;

public class BinarySearch {
    public static void bin_search(int arr[], int lb, int ub, int val){
        int mid = (lb+ub)/2;
        int f = 0;
        while (lb<=ub){
            if (arr[mid]>val){
                ub = mid-1;
            }
            else if (arr[mid]<val){
                lb = mid+1;
            }
            else{
                f = 1;
                System.out.println("Found at: "+(mid+1));
                break;
            }
            mid = (lb+ub)/2;
        }
        if (f == 0){
            System.out.println("Not found");
        }
    }
    public static void sort(int arr[], int n){
        int i, j, exchange;
        for (i = 0; i<n-1; i++){
            exchange = 0;
            for (j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchange = 1;
                }
            }
            if (exchange == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n = s.nextInt();
        s.nextLine();
        int arr[] = new int[n];
        System.out.println("Enter values...");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Enter element to be searched");
        int val = s.nextInt();
        s.nextLine();
        sort(arr, n);
        bin_search(arr,0,n-1,val);

    }
}
