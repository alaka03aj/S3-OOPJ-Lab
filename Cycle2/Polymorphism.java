/*
 * Write a java program to create an abstract class named Shape that contains an empty method named numberOfSides( ). 
 * Provide three classes named Rectangle, Triangle and Hexagon such that each one of the classes extends the class Shape. 
 * Each one of the classes contains only the method numberOfSides( ) that shows the number of sides in the given geometrical structures. (Exercise to understand polymorphism).
 */
import java.util.Scanner;

abstract class Shape{
    public void numberOfSides(){}
}

class Rectangle extends Shape{
    public void numberOfSides(){
        System.out.println("4");
    }
}

class Triangle extends Shape{
    public void numberOfSides(){
        System.out.println("3");
    }
}

class Hexagon extends Shape{
    public void numberOfSides(){
        System.out.println("6");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}
