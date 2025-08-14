public class Lecture13_left_rotate_an_by_one {
    static int [] leftRotate(int ar[]){
        int i=0;
        int a = ar[0];
        for(i=0;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        ar[ar.length-1] = a;
        return ar;
    }
    public static void main(String[] args) {
        System.out.println(" ");
        int arr[] = new int[]{1,2,3,4,5,6,7};
        int uniqueArray[] = leftRotate(arr);
        for(int i=0; i<uniqueArray.length; i++){
            System.out.println(uniqueArray[i]);
        }
    }
}
