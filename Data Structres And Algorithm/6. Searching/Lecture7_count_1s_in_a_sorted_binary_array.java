
//Think by Sir
// public class Lecture7_count_1s_in_a_sorted_binary_array {
//     static int count(int ar[],int low,int high,int x){
//         while(low<=high){
//             int mid = (low + high)/2;
//             if(ar[mid]==0){
//                 low = mid+1;
//             }
//             else{
//                 if(mid==0 || ar[mid-1]!= ar[mid]){       //if(mid==0 || ar[mid-1]==0)
//                     return ar.length-mid;
//                 }
//                 else{
//                     high = mid-1;
//                 }
//             }
//         }
//         return 0;

//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{0,0,0,1,1,1,1};
//         int x =1;
//         int low=0;
//         int high= arr.length-1;
//         System.out.println("The occurrence of 1 is: " + count(arr, low,high, x));
//     }
// }


//Think by You
// public class Lecture7_count_1s_in_a_sorted_binary_array {
//     static int count(int ar[],int low,int high,int x){
//         if(low>high){
//             return -1;
//         }
//         int mid = (low + high)/2;
//         if(x<ar[mid]){
//             return count(ar, low, mid-1, x);
//         }
//         else if(x>ar[mid]){
//             return count(ar, mid+1, high, x);
//         }
//         else{
//             if(mid==0 || ar[mid-1]!= ar[mid]){       //if(mid==0 || ar[mid-1]==0)
//                 return ar.length-mid;
//             }
//             else{
//                 return count(ar, low, mid-1, x);
//             }
//         }

//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{0,0,0,1,1,1,1};
//         int x =1;
//         int low=0;
//         int high= arr.length-1;
//         System.out.println("The occurrence of 1 is: " + count(arr, low,high, x));
//     }
// }


//Think by You
// public class Lecture7_count_1s_in_a_sorted_binary_array {
//     static int count(int ar[],int i,int x){
//         if(i==ar.length){
//             return 0;
//         }
//         if(ar[i]==x){
//             return 1+ count(ar,i+1, x);
//         }
//         return count(ar, i+1, x);

//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{0,0,0,1,1,1,1};
//         int x =1;
//         int i=0;
//         System.out.println("The occurrence of 1 is: " + count(arr, i, x));
//     }
// }
