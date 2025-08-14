//Check if the kth bit is set or not
                                            //Method 1 (Left Shift)
import java.util.Scanner;
public class Lecture6 {
    static void kthBit(int n, int k){
        if((n & (1<<(k-1)))!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n= sc.nextInt();
        System.out.println("Enter the value of k:");
        int k= sc.nextInt();
        kthBit(n,k);
    }
}

                                                //Method 2 (Right Shift)

// import java.util.Scanner;
// public class Lecture6 {
//     static void kthBit(int n, int k){
//         if(((n>>(k-1)) & 1)==1){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n:");
//         int n= sc.nextInt();
//         System.out.println("Enter the value of k:");
//         int k= sc.nextInt();
//         kthBit(n,k);
//     }
// }