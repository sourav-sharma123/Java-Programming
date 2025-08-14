                                                //Stock Buy and Sell
//Naive Solution
// public class Lecture18_stock_buy_and_sell {
//     static int maximumProfit(int price[], int start, int end){
//         if(end<=start){
//             return 0;
//         }
//         int profit =0;
//         for(int i=start; i<end; i++){
//             for(int j=i+1; j<=end; j++){
//                 if(price[j]>price[i]){
//                     int currentProfit = price[j] - price[i] + maximumProfit(price, start, i-1)+ 
//                                         maximumProfit(price, j+1, end);

//                     profit = Math.max(profit, currentProfit);
//                 }
//             }
//         }
//         return profit;
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,5,3,8,12};
//         int start = 0;
//         int end = arr.length-1;
//         System.out.println("The maximum profit is: " + maximumProfit(arr, start,end));
//     }
// }


//Efficient Solution
public class Lecture18_stock_buy_and_sell {
    static int maximumProfit(int price[], int n){
        int profit =0;
        for(int i=1; i<n; i++){
            if(price[i]>price[i-1]){
                profit = profit + (price[i] - price[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,5,3,8,12};
        int end = arr.length;
        System.out.println("The maximum profit is: " + maximumProfit(arr,end));
    }
}



