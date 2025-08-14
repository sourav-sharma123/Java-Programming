//Check whether a given number is power of 2 is not
                                                    //Naive Solution
// import java.util.Scanner;
// public class Lecture8 {
//     static boolean method1(int n){
//         if(n==0){
//             return false;
//         }
//         while(n!=1){
//             if(n%2!=0){
//                 return false;
//             }
//             n=n/2;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(method1(a));
//     }
// }

                                                //Efficient Solution

import java.util.Scanner;
public class Lecture8 {
    static boolean method1(int n){
        if(n==0){
            return false;
        }
        return ((n &(n-1))==0);
        // or 
        // return (n!=0) && ((n &(n-1))==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(method1(a));
    }
}


