/*
 * Write a Java program that implements Quick sort algorithm for sorting a list of names in ascending order.
 */

import java.util.Scanner;

public class QuickSort {
    public int partition(String arr[], int lb, int ub){
        int pivot;
        String temp;
        pivot = lb;
        while(lb<ub){
            if (arr[lb].compareTo(arr[pivot])<0){
                lb++;
            }
            else if (arr[ub].compareTo(arr[pivot])>0){
                ub--;
            }
            else{
                if (lb<ub){
                    temp = arr[lb];
                    arr[lb] = arr[ub];
                    arr[ub] = temp;
                }
            } 
        }
        temp = arr[ub];
        arr[ub] = arr[pivot];
        arr[pivot] = temp;
        return pivot;
    }
    public void qSort(String arr[], int lb, int ub){
        if(lb<ub){
            int p = partition(arr, lb, ub);
            qSort(arr, lb, p-1);
            qSort(arr, p+1, ub);
        }
    }
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n = s.nextInt();
        s.nextLine();
        String arr[] = new String[n];
        System.out.println("Enter values...");
        for(int i=0; i<n; i++){
            arr[i] = s.nextLine();
        }
        q.qSort(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
