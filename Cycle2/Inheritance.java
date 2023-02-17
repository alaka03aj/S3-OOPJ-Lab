/*
 * Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. 
 * It also has a method named 'printSalary( )' which prints the salary of the Employee. 
 * Two classes 'Officer' and 'Manager' inherits the 'Employee' class. 
 * The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
 * Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both of these classes and print the same. (Exercise to understand inheritance).
 */

import java.util.Scanner;

public class Main {
    int age, phone, salary;
    String name, address;
    public void printSalary(){
        System.out.println(salary);
    }
}

class Officer extends Main{
    String spec;
    public Officer(String name, int age, int phone, String address, int salary, String spec){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.spec = spec;
    }
}

class Manager extends Main{
    String dept;
}

class Inheritance extends Manager{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter details for Officer");

        System.out.println("name");
        
    }
}
