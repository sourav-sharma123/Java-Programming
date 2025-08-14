//Find two odd appearing numbers
                                            //Naive Solution
import java.util.Scanner;
public class Lecture10 {
    static void occur(int arr[]){
        for(int i=0; i<arr.length;i++){
            int count= 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,3,4,5,4,4,6,7,7};
        //System.out.println("Enter the number of element in your array");
        // int a = sc.nextInt();
        // int arr[] = new int[a];
        // for(int i=0;i<a;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        System.out.println("Odd two items are:");
        occur(arr);
    }
}

                                                    //Efficient Solution

// import java.util.Scanner;
// public class Lecture10 {
//     static void occur(int arr[]){
//         int XOR=0, res1=0, res2=0;
//         for(int i=0; i<arr.length; i++){
//             XOR= XOR ^ arr[i]; 
//         } 
//         int sn = XOR & ~(XOR-1);
//         for(int i=0; i<arr.length; i++){
//             if((arr[i] & (sn))!=0){
//                 res1 = res1 ^ arr[i];
//             }
//             else{
//                 res2= res2 ^ arr[i];  
//             }
//         }
//         System.out.println("The odds are: " + res1 +" "+ res2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {3,4,3,4,8,4,4,32,7,7};
//         //System.out.println("Enter the number of element in your array");
//         // int a = sc.nextInt();
//         // int arr[] = new int[a];
//         // for(int i=0;i<a;i++){
//         //     arr[i] = sc.nextInt();
//         // }
//         // for (int i = 0; i < arr.length; i++) {
//         //     System.out.println(arr[i]);
//         // }
//         System.out.println("Odd two items are:");
//         occur(arr);
//     }
// }
