
//Naive Solution
// public class Lecture4_index_of_first_occurrence_in_sorted_array {
//     static int firstOccurrence(int ar[], int x){
//         int i =0;
//         for(i=0; i<ar.length;i++){
//             if(ar[i]==x){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,10,10,10,20,20,40};
//         int element = 20;
//         System.out.println("First Occurrence of x is: " + firstOccurrence(arr,element));
//     }
// }



//Recursive Binary Search 
public class Lecture4_index_of_first_occurrence_in_sorted_array {
    static int firstOccurrence(int ar[],int low, int high, int x){
            if(low>high){
                return -1;
            }
            int mid = (low + high)/2;
            if(x<ar[mid]){
                return firstOccurrence(ar, low, mid-1, x);
            }
            else if(x>ar[mid]){
                return firstOccurrence(ar, mid+1, high, x);
            }
            else{
                if(mid==0 || ar[mid-1]!=ar[mid]){
                    return mid;
                }
                else{
                    return firstOccurrence(ar, low, mid-1, x);
                }
            }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,10,10,10,15,15,20,20,40};
        int low =0;
        int high = arr.length-1;
        int element = 15;
        System.out.println("First Occurrence of x is: " + firstOccurrence(arr,low, high,element));
    }
}



//Recursive Binary Search think by You
// public class Lecture4_index_of_first_occurrence_in_sorted_array {
//     static int firstOccurrence(int ar[],int low, int high, int x){
//             if(low>high){
//                 return -1;
//             }
//             int mid = (low + high)/2;
//             if(x<ar[mid]){
//                 return firstOccurrence(ar, low, mid-1, x);
//             }
//             if(x>ar[mid]){
//                 return firstOccurrence(ar, mid+1, high, x);
//             }
//             if(ar[mid] == x){
//                 if(x>ar[low]){
//                     return firstOccurrence(ar, low, mid, x);
//                 }
//                 if(ar[low]==x){
//                     return low;
//                 }
//             }
//         return -1;
//     }
//     public static void main(String[] args) {
//         // int arr[] = new int[]{1,10,10,10,15,15,20,20,40};
//         // int arr[] = new int[]{10,15,20,20,40,40};
//         int arr[] = new int[]{10,20,20,40,40};
//         int low =0;
//         int high = arr.length-1;
//         int element = 40;
//         System.out.println("First Occurrence of x is: " + firstOccurrence(arr,low, high,element));
//     }
// }




//Iterative Solution 
// public class Lecture4_index_of_first_occurrence_in_sorted_array {
//     static int firstOccurrence(int ar[],int low, int high, int x){
//         while(low<=high){
//             int mid = (low + high)/2;
//             if(x<ar[mid]){
//                 high = mid-1;
//             }
//             else if(x>ar[mid]){
//                 low = mid +1;
//             }
//             else{
//                 if(mid==0 || ar[mid-1]!=ar[mid]){
//                     return mid;
//                 }
//                 else{
//                     high = mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         // int arr[] = new int[]{1,10,10,10,15,15,20,20,40};
//         int arr[] = new int[]{5,10,10,20,20};
//         int low =0;
//         int high = arr.length-1;
//         int element = 10;
//         System.out.println("First Occurrence of x is: " + firstOccurrence(arr,low, high,element));
//     }
// }


//Iterative Solution think by You
// public class Lecture4_index_of_first_occurrence_in_sorted_array {
//     static int firstOccurrence(int ar[],int low, int high, int x){
//         while(low<=high){
//             int mid = (low + high)/2;
//             if(x<ar[mid]){
//                 high = mid-1;
//             }
//             else if(x>ar[mid]){
//                 low = mid +1;
//             }
//             if(ar[mid]==x){
//                 if(mid==0 || ar[mid-1]!=ar[mid]){
//                     return mid;
//                 }
//                 if(x>ar[low]){
//                     high = mid-1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         // int arr[] = new int[]{1,10,10,10,15,15,20,20,40};
//         int arr[] = new int[]{5,10,10,20,20};
//         int low =0;
//         int high = arr.length-1;
//         int element = 20;
//         System.out.println("First Occurrence of x is: " + firstOccurrence(arr,low, high,element));
//     }
// }