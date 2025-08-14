//Naive Solution
import java.util.*;
import java.io.*;
import java.lang.*;

class Lecture18_interactions_between_elements_of_2_arrays
{
    public static void main (String[] args) {
        // int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr1[] = new int[]{10,15, 20, 15, 30, 30, 5};
        // int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int arr2[] = new int[]{30,5,30,80};
        int m = arr1.length;
        int n = arr2.length; 
        System.out.println("Hello: "+intersection(arr1, m, arr2, n));
    }
    static int intersection(int arr1[], int m, int arr2[], int n)
    {
        int count=0;
        for(int i=0; i<m; i++){
            boolean flag = false;
            for(int j=0; j<i; j++){
                if(arr1[i]==arr1[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                continue;
            }
            for(int j=0; j<n; j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}




//Effcient Solution
// import java.util.HashSet;

// public class Lecture18_interactions_between_elements_of_2_arrays {
//     public static int interaction(int ar1[], int ar2[]){
//         HashSet<Integer> h = new HashSet<>();
//         int res=0;
//         for(int i=0; i<ar1.length; i++){
//             h.add(ar1[i]);
//         }
//         for(int i=0; i<ar2.length; i++){
//             if(h.contains(ar2[i])){
//                 res++;
//                 h.remove(ar2[i]);
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr1[] = new int[]{10,15,20,15,30,30,5};
//         int arr2[] = new int[]{30,5,30,80};
//         System.out.println("The interaction is: " + interaction(arr1, arr2));
//     }
// }
