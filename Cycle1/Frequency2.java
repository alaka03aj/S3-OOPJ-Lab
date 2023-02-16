/*
Not part of syllabus
Program: Find the frequency of all the characters in a string.
 */
import java.util.Scanner;

public class Frequency2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
        String str = obj.nextLine();
        char strArr[] = str.toCharArray();  //converts str to a char array
        int freq[] = new int[str.length()];

        for (int i=0; i<str.length(); i++){
            freq[i] = 1;    //initialize freq as 1
            for (int j=i+1;j<str.length(); j++){
                if (strArr[i] == strArr[j]){    //if element exists more than once in list, freq[i] is incremented
                    freq[i]+=1;
                    strArr[j] = '0';    //recurring values are changed to 0 to avoid counting same value again
                }
            }
        }

        System.out.println("Frequencies of the characters are displayed below...");
        for (int i = 0; i < freq.length; i++) {
            if (strArr[i]!='0' && strArr[i]!=' '){      //prints only characters(except repeating char and space)
                System.out.println(strArr[i]+": "+freq[i]);
            }
        }
    }
}
