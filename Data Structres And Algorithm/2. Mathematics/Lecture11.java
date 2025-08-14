                                                //Naive Solution

// import java.util.Scanner;

// public class Lecture11 {
//     static boolean isPrime(int x){
//         if (x<=1) return false;
//         if(x==2 || x==3) return true;
//         if(x%2==0 || x%3==0) return false;
//         for (int i=5; i*i<=x; i=i+6){
//             if (x%i==0 || x%(i+2)==0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     static void printPrime(int n){
//         for(int i=2; i<=n;i++)
//         {
//             if(isPrime(i)){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         printPrime(a);
//     }
// }

                                                //Sieve of Erastosthenes

// import java.util.Arrays;
// import java.util.Scanner;

// public class Lecture11 {
//     static void printPrime(int n){
//         boolean isPrime[] = new boolean[n+1];
//         Arrays.fill(isPrime, true);
//         for(int i=2; i*i<=n;i++){
//             if(isPrime[i])
//             {
//                 for(int j=2*i; j<=n; j=j+i)
//                 {
//                     isPrime[j]=false;
//                 }
//             }
//         }
//         for(int i=2; i<=n; i++){
//             if(isPrime[i]){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         printPrime(a);
//     }
// }

//Replace of j=2*i with j=i*i

// import java.util.Arrays;
// import java.util.Scanner;

// public class Lecture11 {
//     static void printPrime(int n){
//         boolean isPrime[] = new boolean[n+1];
//         Arrays.fill(isPrime, true);
//         for(int i=2; i*i<=n;i++){
//             if(isPrime[i])
//             {
//                 for(int j=i*i; j<=n; j=j+i)
//                 {
//                     isPrime[j]=false;
//                 }
//             }
//         }
//         for(int i=2; i<=n; i++){
//             if(isPrime[i]){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         printPrime(a);
//     }
// }


//More shorter implementation of the optimized sieve

import java.util.Arrays;
import java.util.Scanner;

public class Lecture11 {
    static void printPrime(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n;i++){
            if(isPrime[i])
            {
                System.out.println(i);
                for(int j=i*i; j<=n; j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        printPrime(a);
    }
}