/*
 * Write a file handling program in Java with reader/writer.
 */

import java.io.*;
import java.util.Scanner;
public class ReaderWriter {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fname = s.nextLine();
            FileReader r = new FileReader(fname);
            int ch = r.read();
    
            while (ch != -1){
                System.out.print((char)ch);
                ch = r.read();
            }

            r.close();
    
        } 
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter file name: ");
            String fname = s.nextLine();
            FileWriter w = new FileWriter(fname, true);
            w.write("\nI come from england");
            w.close();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
