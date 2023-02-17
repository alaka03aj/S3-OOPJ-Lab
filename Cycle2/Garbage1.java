/*
 * Write a Java program to demonstrate the use of garbage collector.
 */
public class Garbage1 {
    public void finalize(){
        System.out.println("About to do garbage collection");
    }

    public static void main(String[] args) {
        Garbage1 i = new Garbage1();
        i = null;
        System.gc();
    }
}

