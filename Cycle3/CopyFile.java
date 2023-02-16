/*
 * Write a Java program that read from a file and write to file by handling all file related exceptions.
 */

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter input file name: ");
            String fin = s.nextLine();
            System.out.print("Enter output file name: ");
            String fout = s.nextLine();
            FileInputStream fis = new FileInputStream(fin);
            FileOutputStream fos = new FileOutputStream(fout);      //true for append

            int ch = fis.read();

            while(ch!=-1){
                System.out.print((char)ch);
                fos.write(ch);
                ch = fis.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
