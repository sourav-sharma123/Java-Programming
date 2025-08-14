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
public class Lecture12_insert_at_given_position_in_singly_linked_list {
    static Node insertPos(Node head, int x, int pos)
    {
        Node temp = new Node(x);
        if(head==null)          //used when list is empty
        {
            return temp;
        }
        if(pos == 1)           //used when list is not empty
        {
            temp.next = head;
            return temp;
        }
        int count =1;
        Node curr = head;
        while(count < pos-1 && curr!=null)   // curr!=null is used because if koi user list ke beyond add 
                                             // krna chaha to loop break hoga and usse handle krne ke liye
                                             // if (curr == null) wala part likha hai
        {
            curr = curr.next;
            count++;
        }
        if(curr == null)         //if curr == null ho gya to beyond the list ho jayega so for safe paly we use this
                                 //try with value 7 and 8 
        {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
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
        System.out.println("Enter the position where you want to add: ");
        int pos = sc.nextInt();
        System.out.println("Enter the value you want to add: ");
        int x = sc.nextInt();
        head = insertPos(head, x, pos);
        printlist(head);
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
