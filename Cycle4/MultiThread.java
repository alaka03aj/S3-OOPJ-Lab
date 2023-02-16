/*
 * Write a Java program that implements a multi-threaded program which has three threads.
First thread generates a random integer every 1 second. If the value is even, second thread computes the square of the number and prints. 
If the value is odd the third thread will print the value of cube of the number.
 */
import java.util.Random;
class RandomThread extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int rInteger = r.nextInt(100);
            if (rInteger%2 == 0){
                SquareThread t2 = new SquareThread(rInteger);
                t2.start();
            }
            else{
                CubeThread t3 = new CubeThread(rInteger);
                t3.start();
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class SquareThread extends Thread{
    int num;
    SquareThread(int num){
        this.num = num;
    }
    public void run(){
        System.out.print(num+ " " + num*num+"\n");
    }
}

class CubeThread extends Thread{
    int num;
    CubeThread(int num){
        this.num = num;
    }
    public void run(){
        System.out.print(num +" "+ num*num*num +"\n");
    }
}
public class MultiThread {
    public static void main(String[] args) {
        RandomThread t1 = new RandomThread();
        t1.start();
    }

}
