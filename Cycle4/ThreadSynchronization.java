/*
 * Write a Java program that shows thread synchronization.
 */
class printer{
    public synchronized void print(String msg){
        System.out.print('['+msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.print(']');
    }
}

class msg1 extends Thread{
    String msg;
    printer p;
    public msg1(printer p,String msg){
        this.p = p;
        this.msg = msg;
        start();
    }
    public void run(){
        p.print(msg);
    }
}
public class ThreadSynchronization {
    public static void main(String[] args) {
        printer p = new printer();
        new msg1(p,"hello");
        new msg1(p,"people");
    }
}
