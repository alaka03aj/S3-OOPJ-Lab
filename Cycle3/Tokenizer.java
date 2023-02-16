/*
 * Write a Java program that reads a line of integers, and then displays each integer, and the sum of all the integers 
 * (Use String Tokenizer class of java.util).
 */

import java.util.StringTokenizer;
import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a line of integers separated by whitespace.");
        String str = s.nextLine();
        StringTokenizer st = new StringTokenizer(str);      //default delimiter is whitespace
        int a, sum = 0;
        while(st.hasMoreTokens()){
            a = Integer.parseInt(st.nextToken());
            System.out.println(a);
            sum+=a;
        }
        System.out.println("Sum of tokens: "+sum);
    }
}
