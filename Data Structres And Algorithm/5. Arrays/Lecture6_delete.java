//Delete an item from an array
public class Lecture6_delete {
    static int deleteEle(int ar[], int x, int cap){
        int i=0;
        for(i=0; i<cap;i++){
            if(ar[i]==x){
                break;
            }
        }
        if(i==cap){                          //if the element is at the last
            return cap;
        }
        for(int j=i; j<cap-1; j++){
            ar[j]=ar[j+1];
        }
        return cap-1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3,8,12,5,6};
        int x = 12;
        int a = arr.length;
        System.out.println(" ");
        int n= deleteEle(arr, x, a);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
