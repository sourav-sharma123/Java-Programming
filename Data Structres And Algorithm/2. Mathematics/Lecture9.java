// import java.util.Scanner;

// public class Lecture9 {
//     static boolean isPrime(int y)
//     {
//         if(y==1) return false;
//         if (y==2 || y==3) return true;
//         if (y%2 ==0 || y%3 ==0) return false; 
//         for (int i=5; i*i<=y; i=i+6){
//             if(y%i ==0 || y%(i+2) ==0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     static void factors(int x){
//         for(int i=2; i<=x; i++){
//             if(isPrime(i)){
//                 int n=i;
//                 while(x%n==0){
//                     System.out.println(i + " ");
//                     n=n*i;  
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         factors(a);
//     }
// }



// import java.util.Scanner;

// public class Lecture9 {
//     static void factors(int n){
//         for(int i=2; i*i<=n; i++){
//             while(n%i==0){
//                 System.out.println(i + " ");
//                 n=n/i;  
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         factors(a);
//     }
// }



import java.util.Scanner;

public class Lecture9 {
    static void factors(int n){
        if(n<=1) return;
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5; i*i<=n; i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i; 
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2); 
            }
        }
        if(n>3){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        factors(a);
    }
}
