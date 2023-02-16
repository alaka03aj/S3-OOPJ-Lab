/*
 * Program 2: Write a Java Program to find the frequency of a given character in a string.
 */
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
        String str = obj.nextLine();
        System.out.println("Enter character");
        char s = obj.next().charAt(0);
        char strArr[] = str.toCharArray();
        int count = 0;

        for (int i=0; i<strArr.length; i++){
            if (strArr[i] == s){
                count++;
            }
        }

        System.out.println("Frequency of "+s+" in string "+str+": "+count);
    }    
}
