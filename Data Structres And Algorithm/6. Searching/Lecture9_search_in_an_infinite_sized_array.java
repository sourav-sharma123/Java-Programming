
//Naive Solution
// public class Lecture9_search_in_an_infinite_sized_array {
//     static int search(int ar[],int x){
//         int i=0;
//         while(true){
//             if(ar[i]==x){
//                 return i;
//             }
//             if(ar[i]>x){
//                 return -1;
//             }
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,10,15,20,40,80,90,100,120,500,3000};
//         int element =100;
//         System.out.println("The element is at position: " + search(arr, element));
//     }
// }

//This code will tell you the use of binary search. And the logic is very nice you need to check
//this code as it will increase the knowledge and tells you how to use the binary search.
public class Lecture9_search_in_an_infinite_sized_array {
    static int binarySearch(int ar[],int x,int low, int high){    
        while(low<=high){
            int mid = (low + high)/2;
            if(ar[mid]== x){
                return mid;
            }
            if(x<ar[mid]){
                high = mid-1;
            }
            if(ar[mid]<x){
                low = mid +1;
            } 
        }
        return -1;
    }
    static int search(int ar[],int x){
        if(ar[0]==x){
            return 0;

        }
        int i=1;
        while(ar[i]<x){
            i=i*2;
        }
        if(ar[i]==x){
            return i;
        }
        return  binarySearch(ar, x,(i/2)+1,i-1);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,10,15,20,40,80,90,100,120,500,3000};
        int element =100;
        System.out.println("The element is at position: " + search(arr, element));
    }
}
