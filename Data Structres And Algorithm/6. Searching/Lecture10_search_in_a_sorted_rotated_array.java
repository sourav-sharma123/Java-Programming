// public class Lecture10_search_in_a_sorted_rotated_array {
//     static int search(int ar[],int x){
//         int i=0;
//         while(i<ar.length){
//             if(ar[i]==x){
//                 return i;
//             }
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,20,30,40,50,8,9};
//         int x=9;
//         System.out.println("The number is at: " + search(arr,x));
//     }
// }


//Recursive solution think by You but it is not efficicent code
// public class Lecture10_search_in_a_sorted_rotated_array {
//     static int search(int ar[],int x,int i){
//         if(i<ar.length){
//             if(ar[i]==x){
//                 return i;
//             }
//             else{
//                 return search(ar, x,i+1);
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,20,30,40,50,8,9};
//         int i=0;
//         int x=30;
//         System.out.println("The number is at: " + search(arr,x,i));
//     }
// }

public class Lecture10_search_in_a_sorted_rotated_array {
    static int search(int ar[],int x){
        int low=0;
        int high = ar.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]==x){
                return mid;
            }
            if(ar[low]<ar[mid]){
                if(x<ar[mid] && x>=ar[low]){
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(x>ar[mid] && x<=ar[high]){
                    low = mid+1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,8,9};
        int x=50;
        System.out.println("The number is at: " + search(arr,x));
    }
}

