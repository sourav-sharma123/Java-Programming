//Count Set Bits
                                                    //Naive Solution
import java.util.Scanner;
public class Lecture7 {
    static int countSet(int n){
        int res=0;
        while(n>0){
            if (n%2!=0){       
                res++;                
            }
            n=n/2;
        }
        return res;
    }
    
    // while(n>0){
    //     if (n&1==1){       
    //         res++;                
    //     }
    //     n=n>>1;
    // }

    // while(n>0){
    //     res=res + (n&1);
    //     n=n>>1;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
    }
}

                                                    //Brian's Kerningam's Algorithm
// import java.util.Scanner;
// public class Lecture7 {
//     static int countBits(int n){
//         int res=0;
//         while (n>0) {
//             n=(n&(n-1));
//             res++;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(countBits(a));
//     }
// }

                                                    //Lookup Table Method
// import java.util.Scanner;
// public class Lecture7 {
//     static int table[] = new int[256];
//     static void initilize(){
//         table[0]=0;
//         for(int i=1; i<256; i++){
//             table[i] = (i&1) + table[i/2];
//         }
//     }
//     static int countBits(int n){
//         int res= table[n & 0xff];
//         n=n>>8;
//         res= res + table[n & 0xff];
//         n=n>>8;
//         res= res + table[n & 0xff];
//         n=n>>8;
//         res= res + table[n & 0xff];
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         initilize();
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(countBits(a));
//     }
// }