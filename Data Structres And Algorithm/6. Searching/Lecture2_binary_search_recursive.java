public class Lecture2_binary_search_recursive {
    static int recursiveSearch(int ar[],int low, int high,int element){
        int mid = (low+high)/2;
        if(ar[mid]==element){
            return mid;
        }
        if(element<ar[mid]){
            return recursiveSearch(ar, low, mid-1, element);
        }
        if(element>ar[mid]){
            return recursiveSearch(ar, mid+1, high, element);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
        int low =0;
        int high = arr.length-1;
        int n = 100;
        System.out.println("The index is: " + recursiveSearch(arr, low, high, n));
    }
}
