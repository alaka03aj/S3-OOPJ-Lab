/*
 * Write a Java program to demonstrate the use of garbage collector.
 */

public class Garbage2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory is: "+r.totalMemory());
        long mem1, mem2;
        System.out.println("Total memory is: "+r.totalMemory());
        Integer i[] = new Integer[1000];
        System.out.println("Total memory is: "+r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Total free memory: "+mem1);
        r.gc();
        System.out.println("After garbage collection: "+r.freeMemory());

        for (int j = 0; j < 1000; j++) {
            i[j] = j;
        }
        System.out.println("Free memory: "+r.freeMemory());
        mem2 = r.freeMemory();
        System.out.println("remaining memory: "+ (mem1-mem2));

        for (int j = 0; j < 1000; j++) {
            i[j] = null;
        }
        r.gc();
        System.out.println("Remaining memory: "+r.freeMemory());

    }
}
