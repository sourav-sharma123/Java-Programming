//Naive Approach
// public class Lecture4_palindromecheck {
//     static boolean isPal(String str)
//     {
//         StringBuilder rev = new StringBuilder(str);
//         rev.reverse();
//         return str.equals(rev.toString());
//     }
//     public static void main(String args[])
//     {
//         String str = "ABCBA";
//         System.out.println("Hello");
//         System.out.println(isPal(str));
//     }
// }


//Efficient Approach
// public class Lecture4_palindromecheck {
//     static boolean isPal(String str)
//     {
//         int begin = 0;
//         int end = str.length()-1;
//         while(begin<end)
//         {
//             if(str.charAt(begin)!= str.charAt(end))
//             {
//                 return false;
//             }
//             begin++;
//             end--;
//         }
//         return true;
//     }
//     public static void main(String args[])
//     {
//         String str = "ABCBA";
//         System.out.println("Hello");
//         System.out.println(isPal(str));
//     }
// }


// Why Java uses charAt()?
// Because Java is more object-oriented, and it treats String as a class.
// So instead of giving direct access like an array, it gives you methods like .charAt() to safely access characters.

// In C++, strings work like arrays, so you can use str[index].
// In Java, strings are not arrays, so you must use str.charAt(index) to get a letter.
