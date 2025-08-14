//Tail Recursive
//A recursive function is called tail recursive when the paent function has nothing more to do when the child function
//is finished.

// static void fun(int n){
//     if(n==0){
//         return;                     //Tail Recursive
//     }
//     System.out.println(n);
//     fun(n-1);
// }


// static void fun(int n){
//     if(n==0){
//         return;                     //Not Tail Recursive
//     }
//     fun(n-1);
//     System.out.println(n);
// }

// void fun(int n, int k){
//     if(n==0){
//         return;                     //Equivalent Tail Recursion of the above code.
//     }
//     System.out.println(k);
//     fun(n-1, k+1);
// }

//Question 2
// int fact(int n){
//     if(n==0 || n==1){                   //Not Tail Recursive
//         return 1;
//     }
//     return n*fact(n-1);
// }


// int fact(int n, int k){
//     if(n==0 || n==1){                     //Equivalent Tail Recursion of the above code.
//         return k;                   
//     }
//     return fact(n-1, n*k);
// }
