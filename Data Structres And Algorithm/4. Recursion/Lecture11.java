//Sum of Digits using Recursion

import java.util.Scanner;

public class Lecture11 {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(sum(a));
    }
}

                                                    //Iterative Method

// import java.util.Scanner;

// public class Lecture11 {
//     static int sum(int n){
//         int res=0;
//         while(n>0){
//             res= res+ (n%10);
//             n=n/10;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(sum(a));
//     }
// }