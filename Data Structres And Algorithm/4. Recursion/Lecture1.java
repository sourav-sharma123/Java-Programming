                                                    //Basic Recursion Call
// public class Lecture1{
//     static void fun1(){
//         System.out.println("Function 1");
//     }
//     static void fun2(){
//         System.out.println("Before Function 1");
//         fun1();
//         System.out.println("After Function 1");
//     }
//     public static void main(String[] args) {
//         System.out.println("Before Function 2");
//         fun2();
//         System.out.println("After Function 2");
//     }
// }

                                            //Infine Recursive Call of a Function

// public class Lecture1{
//     static void fun1(){
//         System.out.println("GFG");
//         fun1();
//     }
//     public static void main(String[] args) {
//         fun1();
//     }
// }

//To limit the above code we change the parameter after every call

// import java.util.Scanner;
// public class Lecture1{
//     static void fun1(int n){
//         if(n==0){
//             return ;
//         }
//         System.out.println("GFG");
//         fun1(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         fun1(a);
//     }
// }