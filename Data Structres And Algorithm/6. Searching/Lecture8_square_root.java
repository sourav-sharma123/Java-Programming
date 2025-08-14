//Iterative Solution
public class Lecture8_square_root {
    static int root(double n,int i){
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int n=1000000000;
        int i=0;
        System.out.println("The root is: " + root(n, i));
    }
}

//Efficient Solution
// public class Lecture8_square_root {
//     static int root(int n){
//         int low = 1;
//         int high = n;
//         int ans = -1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             int mSq = mid *mid;
//             if(mSq==n){
//                 return mid;
//             }
//             else if(mSq>n){
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//                 ans = mid;
//             }
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         System.out.println(" ");
//         int n=100;
//         int i=1;
//         System.out.println("The root is: " + root(n));
//     }
// }


//Recursive Solution Square Root think by You
// public class Lecture8_square_root {
//     static int root(double n,int i){
//         if(i*i<=n){
//             return root(n, i+1);
//         }
//         return i-1;
//     }
//     public static void main(String[] args) {
//         System.out.println(" ");
//         int n=100;
//         int i=1;
//         System.out.println("The root is: " + root(n, i));
//     }
// }