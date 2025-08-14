// class Node {
//     int data;
//     Node prev;
//     Node next;

//     Node(int x) {
//         data = x;
//         prev = null;
//         next = null;
//     }
// }

// public class Lecture15_doubly_linked_list {
//     static Node printlist(Node head) {
//         Node curr = head;
//         while (curr != null) 
//             System.out.println(curr.data);
//             curr = curr.next;
//         }
//         return head;
//     }

//     public static void main(String[] args) {
//         Node head = new Node(10);
//         Node temp1 = new Node(20);
//         Node temp2 = new Node(30);
//         Node temp3 = new Node(40);
//         Node temp4 = new Node(50);
//         Node temp5 = new Node(60);

//         head.next = temp1;
//         temp1.prev = head;

//         temp1.next = temp2;
//         temp2.prev = temp1;

//         temp2.next = temp3;
//         temp3.prev = temp2;

//         temp3.next = temp4;
//         temp4.prev = temp3;

//         temp4.next = temp5;
//         temp5.prev = temp4;

//         printlist(head);
//     }
// }

// No compilation error, but have runtime error
// The error message:
// prev cannot be resolved or is not a field

// This usually happens if there's another Node class already defined in your project or file, or 
// your code isn't properly saved/compiled.

// ✅ 3 Easy Ways to Fix It:

// 🔹 Option 1: Rename the Class
// Rename your Node class to something unique, like DNode (for Doubly Node):

// 🔹 Option 2: Put Each Class in a Different File
// Make sure each Node class is in a separate file with the same name as the class.

// 🔹 Option 3: Use Inner Class
// If you're only using the Node class inside a single main class, you can also make it an inner class, like this:
// But isme inner class ko static banana padega


public class Lecture15_doubly_linked_list {
    static class Node 
    {
        int data;
        Node prev;
        Node next;
        Node(int x)
        {
            data = x;
            prev = null;
            next = null;
        }
    }
    static void printlist(Node head)
    {
        Node curr= head;
        while(curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        Node temp5 = new Node(60);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = temp3;
        temp3.prev = temp2;
        temp3.next = temp4;
        temp4.prev = temp3;
        temp4.next = temp5;
        temp5.prev = temp4;
        printlist(head);
    }
}
