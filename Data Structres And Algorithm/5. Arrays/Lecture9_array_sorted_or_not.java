                                                //Array sorted or not
//Naive Solution
public class Lecture9_array_sorted_or_not {
    static boolean isSorted(int ar[]){
        boolean flag = true;
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j<ar.length-1;j++){
                if(ar[j]<ar[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{8,10,10,15};
        System.out.println(isSorted(arr));
    }
}

//Efficient Solution (You think it without any clue or idea from sir's thought)

// public class Lecture9_array_sorted_or_not {
//     static boolean isSorted(int ar[]){
//         boolean flag = true;
//         for(int i=0; i<ar.length-1; i++){
//             if(ar[i]<=ar[i+1]){
//                 flag = true;
//             }
//             else{
//                 return false;
//             }
//         }
//         return flag;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{8,10,10,15};
//         System.out.println(isSorted(arr));
//     }
// }
