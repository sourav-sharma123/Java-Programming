                                                    //Naive Solution

// import java.util.Scanner;

// public class Lecture10 {
//     static void divisors(int n){
//         for(int i=1; i<=n; i++){
//             if(n%i ==0){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         divisors(a);
//     }
// }


//Prints the number in the unsorted manner

// import java.util.Scanner;

// public class Lecture10 {
//     static void divisors(int n){
//         for(int i=1; i*i<=n; i++){
//             if(n%i ==0){
//                 System.out.println(i);
//                 if(i!=n/i){
//                     System.out.println(n/i);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         divisors(a);
//     }
// }

//Prints the number in the unsorted manner

import java.util.Scanner;

public class Lecture10 {
    static void divisors(int n){
        int i;
        for(i=1; i*i<=n; i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
        for( ;i>=1;i--)
        {
            if(n%i==0)
            {
                System.out.println(n/i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        divisors(a);
    }
}