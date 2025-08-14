// class Node
// {
//     int data;
//     Node next;
//     Node(int x)
//     {
//         data = x;
//         next = null;          //next ko null nhi likhoge to bhi chalega because ye by default null hota hai
//     }
// }
// public class Lecture6_traversing_a_linked_list
// {
//     static void printlist(Node head)
//     {
//         Node curr = head;
//         while(curr!= null)
//         {
//             System.out.println(curr.data);
//             curr = curr.next;
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Node head = new Node(10);
//         Node temp1 = new Node(20);
//         Node temp2 = new Node(30);
//         Node temp3 = new Node(40);
//         Node temp4 = new Node(50);
//         Node temp5 = new Node(60);
//         head.next = temp1;
//         temp1.next = temp2;
//         temp2.next = temp3;
//         temp3.next = temp4;
//         temp4.next = temp5;
//         printlist(head);
//     }
// }

// 1. Node head — "Declares a reference variable"
//     You are creating a variable named head.
//     This variable can hold the address of a Node object.
//     It's just a label or pointer, not the object itself.

// 🔍 Memory:
//     Stored on the stack because it's a local variable in a method (like main).
//     Usually takes 4 bytes (32-bit system) or 8 bytes (64-bit system).
//     This space holds only the memory address, not the object.

// 2. new — "Allocates memory on heap"
//     The new keyword asks the system to create an object in the heap memory.
//     Think of it like saying:
//     "Hey, Java, give me some space in your big memory area to keep my data!"

// 🔍 Memory:
//     Heap memory is used for dynamic objects (created with new).
//     The memory is given to a new Node object.
//     The memory address of that new box is given to head.

// 3. Node(10) — "Calls constructor to set values"
//     You are calling the constructor of the Node class.
//     It sets data = 10 and next = null.
//     This fills up the memory space that was just allocated by new.

// 🔍 Memory:
//     The size depends on what's inside:
//     int data = 4 bytes
//     Node next = 4 or 8 bytes (a reference to another Node)
//     So overall: about 8 to 16 bytes used in the heap.


// 🎨 Think of it Like:
// Stack:
// A small box on your desk – fast to reach but limited in space.

// Heap:
// A big storage room – slower to access, but you can store lots of things.



// C++ Implementation
// #include <bits/stdc++.h> 
// using namespace std; 

// struct Node{
//     int data;
//     Node* next;
//     Node(int x){
//         data=x;
//         next=NULL;
//     }
// };

// void printlist(Node *head){
//     Node *curr=head;
//     while(curr!=NULL){
//         cout<<curr->data<<" ";
//         curr=curr->next;
//     }
// }

// int main() 
// { 
// 	Node *head=new Node(10);
// 	head->next=new Node(20);
// 	head->next->next=new Node(30);
// 	head->next->next->next=new Node(40);
// 	printlist(head);
// 	return 0;
// } 

