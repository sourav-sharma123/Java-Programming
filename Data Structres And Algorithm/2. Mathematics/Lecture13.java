                                                    //Iterative Power

// import java.util.Scanner;

// public class Lecture13 {
//     static int power(int x, int n){
//         int res=1;
//         while(n>0){
//             if(n%2!=0){
//                 res = res*x;
//             }
//             x= x*x;
//             n=n/2;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println("Enter the power");
//         int b = sc.nextInt();
//         System.out.println(power(a, b));
//     }
// }

                                            //Using of Bit Operator

// import java.util.Scanner;

// public class Lecture13 {
//     static int power(int x, int n){
//         int res=1;
//         while(n>0){
//             if(n%2!=0){             //Replace n%2!=0 with n&1 only in C++
//                 res = res*x;
//             }
//             x= x*x;
//             n=n>>1;                //Replace n=n/2; with n=n>>1;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println("Enter the power");
//         int b = sc.nextInt();
//         System.out.println(power(a, b));
//     }
// }

//Modulus foe greater data handling

import java.util.Scanner;

public class Lecture13 {
    static int power(int x, int n, int modu){
        int res=1;
        while(n>0){
            if(n%2!=0){             //Replace n%2!=0 with n&1 only in C++
                res = (res*x)% modu;
            }
            x= (x*x)% modu;
            n=n>>1;                //Replace n=n/2; with n=n>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println("Enter the modulus");
        int mod = sc.nextInt();
        System.out.println(power(a, b, mod));
    }
}
