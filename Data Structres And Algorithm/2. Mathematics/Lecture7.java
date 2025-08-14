// import java.util.Scanner;

// public class Lecture7 {
//     static int Lcm(int x, int y){
//         int temp= Math.max(x, y);
//         while(true)
//         {
//             if(temp%x ==0 && temp%y ==0){
//                 return temp;
//             }
//             temp++;
//         }
//         //return 1;  Unreachable code (because here we use while(true))
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println(Lcm(a, b));
//     }
// }





//Created By you 

// import java.util.Scanner;

// public class Lecture7 {
//     static int Lcm(int x, int y){
//         int temp= Math.max(x, y);
//         while(x!=0)
//         {
//             if(temp%x ==0 && temp%y ==0){
//                 break;
//             }
//             else{
//                 temp++;
//             }
//         }
//         return temp;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println(Lcm(a, b));
//     }
// }



//Efficient Solution

import java.util.Scanner;

public class Lecture7 {
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, y%x);
    }
    static int Lcm(int x, int y){
        return x*y / gcd(x, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println(Lcm(a, b));
    }
}