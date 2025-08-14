// public class Lecture16_count_distinct_elements {
//     public static int count(int ar[],int n ){
//         int count=0;
//         for(int i=0;i<n;i++){
//             boolean flag = false;
//             for(int j=0; j<i; j++){
//                 if(ar[i]==ar[j]){
//                     flag =true;
//                     break;
//                 }
//             }
//             if(flag== false)
//             count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{15,12,13,12,13,13,18};
//         int n = arr.length;
//         System.out.println("The distinct elements is: " + count(arr, n));
//     }
// }

// import java.util.HashSet;
// public class Lecture16_count_distinct_elements {
//     public static int count(int ar[]){
//         HashSet<Integer> s = new HashSet<>();
//         for(int i=0;i<ar.length; i++){
//             s.add(ar[i]);
//         }
//         return s.size();
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{15,12,13,12,13,13,18};
//         System.out.println("The distinct elements is: " + count(arr));
//     }
// }



// import java.util.Arrays;
// import java.util.HashSet;
// public class Lecture16_count_distinct_elements {
//     public static int count(Integer ar[]){
//         HashSet<Integer> s = new HashSet<>(Arrays.asList(ar));
//         return s.size();
//     }
//     public static void main(String[] args) {
//         Integer arr[]= {15,12,13,12,13,13,18};
//         System.out.println("The distinct elements is: " + count(arr));
//     }
// }


import java.util.HashSet;
public class Lecture16_count_distinct_elements {
    public static int count(Integer ar[]){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<ar.length; i++){
            s.add(ar[i]);
        }
        return s.size();
    }
    public static void main(String[] args) {
        Integer arr[] = {15,12,13,12,13,13,18};
        System.out.println("The distinct elements is: " + count(arr));
    }
}