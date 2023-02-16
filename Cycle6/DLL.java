/*
 * Write a Java program for the following:
1) Create a doubly linked list of elements.
2) Delete a given element from the above list.
3) Display the contents of the list after deletion.
*/
import java.util.Scanner;
class DLLFunctions{
    static Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    void InsertF(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    void InsertB(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else{
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.prev = ptr;
        }
    }
    void InsertAfter(int data, int nodeVal){
        Node newNode = new Node(data);
        Node ptr = head;
        int f = 0;

        if (head == null){
            System.out.println("Empty list");
        }
        else{
            while (ptr!=null){
                if (ptr.data == nodeVal){
                    f = 1;
                    Node temp = ptr.next;
                    ptr.next = newNode;
                    newNode.prev = ptr;
                    newNode.next = temp;
                    temp.prev = newNode;
                    break;
                }
                ptr = ptr.next;
            }
            if (f==0){
                System.out.println("Element not in list");
            }
        }
    }
    void DeleteF(){
        Node temp;
        if (head == null){
            System.out.println("Empty list");
        }
        else{
            int data = head.data;
            temp = head.next;
            temp.prev = null;
            head = temp;
            System.out.println("Item deleted is: "+data);
        }
    }
    void DeleteB(){
        if (head == null){
            System.out.println("Empty list");
        }
        else{
            Node ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            int data = ptr.data;
            ptr.prev.next = null;
            System.out.println("Item deleted is: "+data);
        }
    }
    void DeleteAny(int val){
        Node ptr = head;
        int f = 0;
        if (head == null){
            System.out.println("List empty");
        }
        if (head.data == val){
            if (head.next!=null){
                f = 1;
                Node temp = head;
                head = head.next;
                temp.next = null;
                temp.prev = null;
            }
            else{
                head = null;
            }
            System.out.println("Item deleted: "+val);
        }
        else{
            while(ptr.next!=null){
                if (ptr.next.data == val){
                    f = 1;
                    Node temp = ptr.next;
                    if (temp.next == null){
                        temp.prev = null;
                        ptr.next = null;
                    }
                    else{
                        ptr.next = temp.next;
                        temp.next.prev = ptr;
                        temp.prev = null;
                        temp.next = null;
                    }
                    System.out.println("Deleted: "+val);
                }
                ptr = ptr.next;
            }
        }
        if (f == 0){
            System.out.println("Not found");
        }
    }
    void display(){
        if (head == null){
            System.out.println("Empty");
        }
        else{
            Node ptr = head;
            while(ptr!=null){
                System.out.print(ptr.data+"->");
                ptr = ptr.next;
            }
            System.out.print("X");
        }
    }

}

public class DLL {
    public static void main(String[] args) {
        DLLFunctions d = new DLLFunctions();
    Scanner s = new Scanner(System.in);
    int ask;
    do{
        System.out.print("\n1:INSERT AT BEGIN\n2:INSERT AT END\n3:INSERT AFTER A NODE\n4:DELETE FROM FRONT\n5:DELETE FROM BACK\n6:DELETE BY VALUE\n7:DISPLAY\n8:EXIT\n");
        System.out.print("Enter your choice:");
        ask=s.nextInt();
        int val;
        switch(ask){
        case 1:
            System.out.print("Enter the data:");
            val=s.nextInt();
            d.InsertF(val);
        break;
        case 2:
            System.out.print("Enter the data:");
            val=s.nextInt();
            d.InsertB(val);
            break;
        case 3:
            System.out.print("Value to insert:");
            val=s.nextInt();
            System.out.print("Enter the node after which insertion should take place:");
            int newval=s.nextInt();
            d.InsertAfter(val,newval);
            break;
        case 4:
            System.out.println("Deleting from front...");
            d.DeleteF();
            break;
        case 5:
            System.out.println("Deleting from back...");
            d.DeleteB();
            break;
        case 6:
            System.out.print("Enter the data:");
            val=s.nextInt();
            d.DeleteAny(val);
            break;
        case 7:
            d.display();
            break;
        case 8:
            System.out.println("Exiting.....\n");
            System.exit(0);
        default :
            System.out.println("Invalid choice");
        }
    }
    while(ask<8);
    }
}
