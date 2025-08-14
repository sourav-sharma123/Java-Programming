//Recursive Solution by Sir
// public class Lecture5_index_of_last_occurrence_in_sorted_array {
//     static int lastOccurrence(int ar[], int low, int high,int x){
//         if(low>high){
//             return -1;
//         }
//         int mid = (low+high)/2;
//             if(x<ar[mid]){
//                 return lastOccurrence(ar, low, mid-1, x);
//             }
//             if(x>ar[mid]){
//                 return lastOccurrence(ar, mid +1, high, x);
//             }
//             else{ 
//                 if(mid==ar.length-1 || ar[mid]!=ar[mid+1]){
//                     return mid;
//                 }
//                 else{
//                     return lastOccurrence(ar, mid+1, high, x);
//                 }
//             }
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,15,20,20,40,40};
//         int low= 0;
//         int high = arr.length-1;
//         int x= 40;
//         System.out.println("The last index is: " + lastOccurrence(arr, low, high, x));
//     }
// }


//Recursive solution think by You   (Not correct)
// public class Lecture5_index_of_last_occurrence_in_sorted_array {
//     static int lastOccurrence(int ar[], int low, int high,int x){
//         if(low>high){
//             return -1;
//         }
//         int mid = (low+high)/2;
//             if(x<ar[mid]){
//                 return lastOccurrence(ar, low, mid-1, x);
//             }
//             if(x>ar[mid]){
//                 return lastOccurrence(ar, mid +1, high, x);
//             }
//             if(ar[mid] == x){ 
//                 if(x<ar[low]){
//                     return lastOccurrence(ar, mid, high, x);
//                 }
//                 if(ar[low]==x){
//                     return low;
//                 }
//             }
//             return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,20,20,40,40};
//         // int arr[] = new int[]{10,20,20,40,40};
//         int low= 0;
//         int high = arr.length-1;
//         int x= 20;
//         System.out.println("The last index is: " + lastOccurrence(arr, low, high, x));
//     }
// }


//Iterative Solution by Sir
// public class Lecture5_index_of_last_occurrence_in_sorted_array {
//     static int lastOccurrence(int ar[], int low, int high,int x){
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(x<ar[mid]){
//                 high = mid-1;
//             }
//             if(x>ar[mid]){
//                 low =mid+1;
//             }
//             else{ 
//                 if(mid==ar.length-1 || ar[mid+1]!=ar[mid]){
//                     return mid;
//                 }
//                 else{
//                     low = mid +1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,15,20,20,40,40};
//         int low= 0;
//         int high = arr.length-1;
//         int x= 40;
//         System.out.println("The last index is: " + lastOccurrence(arr, low, high, x));
//     }
// }



//Iterative solutio think by You   (Not Correct)
// public class Lecture5_index_of_last_occurrence_in_sorted_array {
//     static int lastOccurrence(int ar[], int low, int high,int x){
//         if(low>high){
//             return -1;
//         }
//         while(low<=high){
//             int mid = (low+high)/2;
//             if(x<ar[mid]){
//                 high=mid-1;
//             }
//             if(x>ar[mid]){
//                 low = mid +1;
//             }
//             if(ar[mid] == x){ 
//                 if(x<ar[low]){
//                     low = mid+1;
//                 }
//                 if(ar[low]==x){
//                     return low;
//                 }
//             }
//         }
//             return -1;
//     }
//     public static void main(String[] args) {
//         // int arr[] = new int[]{10,15,20,20,40,40};
//         int arr[] = new int[]{10,20,20,40,40};
//         int low= 0;
//         int high = arr.length-1;
//         int x= 40;
//         System.out.println("The last index is: " + lastOccurrence(arr, low, high, x));
//     }
// }


