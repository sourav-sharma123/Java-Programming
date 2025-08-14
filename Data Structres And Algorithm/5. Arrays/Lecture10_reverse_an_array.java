//Reverse an array (You thought it without any clue)

public class Lecture10_reverse_an_array {
    static int reverse(int ar[]){
        int cap = ar.length;
        int temp;
        int j=cap-1;
        for(int i=0; i<(cap/2); i++){
            temp= ar[i];
            ar[i]= ar[j];
            ar[j]= temp;
            j--;
        }
        return cap;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,7};
        System.out.println(" ");
        int n =reverse(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
