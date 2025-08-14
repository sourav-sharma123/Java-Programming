//Iterative Solution
import java.util.Scanner;
class Node
{
    int data; 
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}
public class Lecture13_search_in_a_linked_list {
    static int searchLL(Node head, int x)
    {
        int count= 1;
        Node curr = head;
        while(curr!=null)
        {
            if(curr.data==x)
            {
                return count;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60); 
        printlist(head);
        System.out.println("Enter the value you want to search: ");
        int x = sc.nextInt();
        int result = searchLL(head, x);
        if(result<0)
        {
            System.out.println("Element do not found");
        }
        else
        {
            System.out.println("Element fount at position: " + searchLL(head, x));
        }
    }
    static void printlist(Node head)
    {
        Node curr  = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}

//Recursive Solution
// import java.util.Scanner;
// class Node
// {
//     int data; 
//     Node next;
//     Node(int x)
//     {
//         data = x;
//         next = null;
//     }
// }
// public class Lecture13_search_in_a_linked_list {
//     static int searchLL(Node head, int x)
//     {
//         if(head==null)
//         {
//             return -1;
//         }
//         if(head.data == x)
//         {
//             return 1;
//         }
//         else
//         {
//             int res = searchLL(head.next, x);
//             if(res==-1)
//             {
//                 return -1;
//             }
//             else
//             {
//                 return res+1;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Node head = new Node(10);
//         head.next = new Node(20);
//         head.next.next = new Node(30);
//         head.next.next.next = new Node(40);
//         head.next.next.next.next = new Node(50);
//         head.next.next.next.next.next = new Node(60); 
//         printlist(head);
//         System.out.println("Enter the value you want to search: ");
//         int x = sc.nextInt();
//         int result = searchLL(head, x);
//         if(result<0)
//         {
//             System.out.println("Element do not found");
//         }
//         else
//         {
//             System.out.println("Element fount at position: " + searchLL(head, x));
//         }
//     }
//     static void printlist(Node head)
//     {
//         Node curr  = head;
//         while(curr!=null)
//         {
//             System.out.println(curr.data);
//             curr = curr.next;
//         }
//     }
// }
