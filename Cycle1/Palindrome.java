/*
 * Program 1: Write a Java program that checks whether a given string is a palindrome or not.
 */

import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
        String str = obj.nextLine();
        int len = str.length();
        int pass = 1;

        for( int i=0,j=len-1;i<=j;i++,j--){
            if (str.charAt(i) != str.charAt(j)){
                pass = 0;
                break;
            }
        }

        if (pass == 0){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
    }
}