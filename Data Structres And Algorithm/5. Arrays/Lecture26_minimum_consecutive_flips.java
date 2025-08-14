public class Lecture26_minimum_consecutive_flips {
    static void printGroups(int arr[], int n)
    {
        for(int i =1; i<n; i++)
        {
            if(arr[i]!= arr[i-1])
            {
                if(arr[i]!= arr[0])
                {
                    System.out.print("From " + i +" to ");
                }
                else
                {
                    System.out.println(i-1);
                }
            }
        }
        if(arr[n-1]!= arr[0])
        {
            System.out.println(n-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,1,1,0,0,1,1,0,1};
        int n = arr.length;
        printGroups(arr, n);
    }
}
