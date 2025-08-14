// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class practise
// {
//     public static void main (String[] args) {
//         int arr[] = new int[]{15, 16, 27, 27, 28, 15};
//         int n = arr.length;
        
//         countFreq(arr, n);
//     }
    
//     static void countFreq(int arr[], int n)
//     {
//         Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
//         for(int i = 0; i < n; i++)
//         {
//             int key = arr[i];
//             if(hmp.containsKey(arr[i]) == true)
//               hmp.put(arr[i], hmp.getOrDefault(arr[i], 0) + 1);
//             else
//               hmp.put(arr[i], 1);    
//         }
    
//        for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
//         System.out.println(itr.getKey() + " " + itr.getValue());
//     }
// }



// import java.util.Arrays;
// public class practise {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//         int[] arr = {5, 1, 4, 2, 8};
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr)); // Output: [1, 2, 4, 5, 8]
//     }
// }


import java.util.*;
import java.io.*;
import java.lang.*;

class practise
{
    public static void main (String[] args) {
        int arr1[] = new int[]{15, 17, 27, 27, 28, 15};
        int arr2[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = arr1.length;
        int n = arr2.length;
        
        System.out.println("Hello: "+intersection(arr1, m, arr2, n));
    }
    
    static int intersection(int arr1[], int m, int arr2[], int n)
    {
        int count=0;
        for(int i=0; i<m; i++){
            boolean flag = false;
            for(int j=0; j<i-1; j++){
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
