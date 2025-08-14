public class Lecture1_binary_search{
    static int binarySearch(int ar[],int x){
        int low =0; 
        int high = ar.length-1;
        
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
    public static void main (String [] args){
        System.out.println("Hello");
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
        int x =60;
        System.out.println("The index is: " + binarySearch(arr, x));
    }
}