//Naive Method (You created this but very dx very is help from the teacher in the while loop)

// import java.util.Scanner;

// public class Lecture5{
//     static int trail(int x){
//         int result=0;
//         int res=1;
//         if (x==0 || x==1)
//         {
//             return 1;
//         }
//         for(int i=x; i>0; i--)
//         {
//             res = res *i ;
//         }
//         int temp = res;
//         while(temp%10 ==0)
//         {
//             ++result;
//             temp=temp/10;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a  = sc.nextInt();
//         System.out.println(trail(a));
//     }
// }


//(Naive Method)Code made by works fine but you need to enhance your logic

// import java.util.Scanner;

// public class Lecture5{
//     static int trail(int x){
//         int result=0;
//         int last=0;
//         int res=1;
//         if (x==0 || x==1)
//         {
//             return 1;
//         }
//         for(int i=x; i>0; i--)
//         {
//             res = res *i ;
//         }
//         int temp = res;
//         while(last == 0 && temp>0)
//         {
//             last = temp%10;
//             temp=temp/10;
//             ++result;
//         }
//         return result-1;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a  = sc.nextInt();
//         System.out.println(trail(a));
//     }

// }

                                        //Efficient Method
// import java.util.Scanner;
// public class Lecture5{
//     static int fact(int y){
//         if( y==0 || y==1)
//         {
//             return 1;
//         }
//         return (y*fact(y-1));
//     }
//     static int countTrail(int z){
//         int res= 0;
//         for(int i=5; i<=z; i=i*5)
//         {
//             res = res + (z/i);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a  = sc.nextInt();
//         int z = fact(a);
//         System.out.println(countTrail(z));
//     }
// }


public class Lecture5{
	static int countTrailingZeros(int n)
	{
		int res = 0;

		for(int i=5; i<=n; i=i*5)
		{
			res = res + (n / i);
		}

		return res;
	}
	public static void main (String[] args) {	
		int number = 251;
		System.out.println(countTrailingZeros(number));
        System.out.println(countTrailingZeros(number));
	}
}