//Find the only odd occurring number
                                                //Naive Solution
// import java.util.Scanner;
// public class Lecture9 {
//     static void occur(int arr[]){
//         for(int i=0; i<arr.length;i++){
//             int count= 0;
//             for(int j=0; j<arr.length;j++){
//                 if(arr[j]==arr[i]){
//                     count ++;
//                 }
//             }
//             if(count%2!=0){
//                 System.out.println("The odd occurring number is: " + arr[i]);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //int arr[] = {4,3,4,4,4,5,5};
//         System.out.println("Enter the number of element in your array");
//         int a = sc.nextInt();
//         int arr[] = new int[a];
//         for(int i=0;i<a;i++){
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//         occur(arr);
//     }
// }

                                                //Efficient Solution
import java.util.Scanner;
public class Lecture9 {
    static int occur(int arr[]){
        int res= 0;
        for(int i=0; i<arr.length;i++){
            res= res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,3,4,4,4,5,5};
        //System.out.println("Enter the number of element in your array");
        // int a = sc.nextInt();
        // int arr[] = new int[a];
        // for(int i=0;i<a;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        System.out.println(occur(arr));
    }
}