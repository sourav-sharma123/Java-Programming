// Use this code when:(Non Nested Class)
// 1. The Node class is globally accessible, meaning any other class in the same package can use it 
//    without referencing linkedlist.
// 2. You want a modular design where Node is independent and can be used in multiple places.

import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        Node head= new Node(10);
        System.out.println("Head ka data "+ head.data);
        System.out.println("Head kisko point kr rha hai abhi " + head.next);
        Node temp1= new Node(20);
        System.out.println("Temp1 ka data "+ temp1.data);
        System.out.println("Temp1 kisko point kr rha hai abhi " + temp1.next);
        Node temp2= new Node(30);
        System.out.println("Temp2 ka data "+ temp2.data);
        System.out.println("Temp2 kisko point kr rha hai abhi " + temp2.next);
        head.next = temp1;
        System.out.println("Head ka data "+ head.data);
        System.out.println("Head kisko point kr rha hai abhi " + head.next);
        System.out.println("Temp1 ka address " + temp1);
        temp1.next = temp2;
        System.out.println("Temp1 ka data "+ temp1.data);
        System.out.println("Tem1 kisko point kr rha hai abhi " + temp1.next);
        System.out.println("Temp2 ka address " + temp2);
        temp2.next = null;
        System.out.println("Temp2 ka data "+ temp2.data);
        System.out.println("Temp2 kisko point kr rha hai abhi " + temp2.next);
        System.out.println(head.data + "->" + temp1.data + "->" + temp2.data);
    }
}
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}

//Use this code when:(Nested non-Static Class)
// import java.util.*;
// public class linkedlist {
//     class Node{
//         int data;
//         Node next;
//         Node(int x)
//         {
//             data=x;
//             next=null;
//         }
//     }
//     public static void main(String[] args) {
//         Node head= new Node(10);
//         Node temp1= new Node(20);
//         Node temp2= new Node(30);
//         head.next = temp1;
//         temp1.next = temp2;
//         temp2.next = null;
//         System.out.println(head.data + "->" + temp1.data + "->" + temp2.data);
//     }
// }

// 1. The code will not compile because of the following issue:

//    (i)  The Node class is declared as an inner (non-static) class with respect to outer (linkedlist) class.
//    (ii) But in the main method, you are trying to create Node objects directly using new Node(...). 
//         This is not allowed for non-static inner classes.

// 2. Why does this happen?
//    In Java, when a class(Node) is non-static and nested (inner class):

//    (i)  It is tied to an instance of the outer class (linkedlist in this case).
//    (ii) To create an object of a non-static inner class, you first need an object of the outer class. 
//         The inner class cannot exist independently.

//    In your code:
//    Node head = new Node(10);
//    You are trying to create a Node object directly without creating an instance of the outer class linkedlist.
//    This causes the error because Node is non-static and needs an outer class instance to be created.

// 3. Solution:

//    You have two ways to fix this issue:

//    Option 1: Make the Node class static
//    If you declare the Node class as static, it will no longer be tied to an instance of the linkedlist class. 
//    You can then create Node objects directly inside the main method.
//    static class Node  <-- Make the class static

//    Option 2: Use an instance of the outer class
//    If you want to keep the Node class as non-static, you need to create an object of the linkedlist class 
//    before creating Node objects.

// public class linkedlist {
//     class Node { // Non-static inner class
//         int data;
//         Node next;
//         Node(int x) {
//             data = x;
//             next = null;
//         }
//     }
//     public static void main(String[] args) {
//         linkedlist list = new linkedlist(); // Create an instance of the outer class
//         Node head = list.new Node(10); // Use the outer class instance to create Node
//         Node temp1 = list.new Node(20);
//         Node temp2 = list.new Node(30);


// Use this code when:(Nested Static Class)
// 1. The Node class is only needed by the linkedlist class and won't be reused elsewhere.
// 2. You want to keep the Node class hidden and tied to the linkedlist implementation.

// import java.util.*;
// public class linkedlist {
//     static class Node { // <-- Make the class static
//         int data;
//         Node next;
//         Node(int x) {
//             data = x;
//             next = null;
//         }
//     }
//     public static void main(String[] args) {
//         Node head = new Node(10); // No need for an outer class instance
//         Node temp1 = new Node(20);
//         Node temp2 = new Node(30);
//         head.next = temp1;
//         temp1.next = temp2;
//         temp2.next = null;
//         System.out.println(head.data + "->" + temp1.data + "->" + temp2.data);
//     }
// }



//Using function without static 
//agr static use nhi karoge to function ko class ke object ke name se excess krna padega, function esa cahega karega
//ki use sb bola bola ke lao.

// import java.util.*;
// public class linkedlist {
//     public static void main(String[] args) {
//         linkedlist a = new linkedlist();
//         Node head= null;
//         head = a.insertBegin(head, 30);
//         head = a.insertBegin(head, 20);
//         head = a.insertBegin(head, 10);
//         a.printList(head);
//     }

//     Node insertBegin(Node head, int x){
//         Node temp = new Node(x);
//         temp.next = head;
//         return temp;
//     }

//     void printList(Node head){
//         Node curr = head;
//         while(curr!=null)
//         {
//             System.out.println(curr.data);
//             System.out.println("hello");
//             curr = curr.next;
//         }
//     }
// }
// class Node{
//     int data;
//     Node next;
//     Node(int x)
//     {
//         data=x;
//         next=null;
//     }
// }

//Using function with a static
//agr static use karoge to function ko khi bhi use kro within the class and function esa feel karega ki
//use koi bhi use kr skta hai.

// import java.util.*;
// public class linkedlist {
//     public static void main(String[] args) {
//         Node head= null;
//         head = insertBegin(head, 30);           //head = linkedlist.insertBegin(head, 30); (same)
//         head = insertBegin(head, 20);
//         head = insertBegin(head, 10);
//         printList(head);
//     }

//     static Node insertBegin(Node head, int x){
//         Node temp = new Node(x);
//         temp.next = head;
//         return temp;
//     }

//     static void printList(Node head){
//         Node curr = head;
//         while(curr!=null)
//         {
//             System.out.println(curr.data);
//             System.out.println("hello");
//             curr = curr.next;
//         }
//     }
// }
// class Node{
//     int data;
//     Node next;
//     Node(int x)
//     {
//         data=x;
//         next=null;
//     }
// }

