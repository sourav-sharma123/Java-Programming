//Naive Method
import java.util.Arrays;
import java.util.Scanner;

public class Lecture6_areAnagram {
    static boolean areAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char a1[] = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);            
        char a2[] = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);
        return (s1.equals(s2));
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string s1:");
        String s1 = sc.nextLine();
        System.out.println("Enter the string s2");
        String s2 = sc.nextLine();
        if(areAnagram(s1, s2))
        {
            System.out.println("The two strings are" + "anagram of each other.");
        }
        else
        {
            System.out.println("The two strings are not" + "anagram of each other.");
        }
    }
}


//What does this line (s1 = new String(a1);) do?
// char a1[] = {'l', 'i', 's', 't', 'e', 'n'};
// Arrays.sort(a1);  // Now a1 becomes: ['e', 'i', 'l', 'n', 's', 't']
// s1 = new String(a1);           s1 = "eilnst"



//Efficient Method
// import java.util.Scanner;

// public class Lecture6_areAnagram {
//     static final int CHAR = 256;
//     static boolean areAnagram(String s1, String s2)
//     {
//         int count[] = new int[CHAR];
//         for(int i=0;i<s1.length();i++)
//         {
//             count[s1.charAt(i)]++;
           
//             count[s2.charAt(i)]--;
//         }
//         for(int i=0;i<CHAR; i++)
//         {
//             if(count[i]!=0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[])
//     {
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("Enter the string s1:");
//         String s1 = sc.nextLine();
//         System.out.println("Enter the string s2");
//         String s2 = sc.nextLine();
//         if(areAnagram(s1, s2))
//         {
//             System.out.println("The two strings are" + "anagram of each other.");
//         }
//         else
//         {
//             System.out.println("The two strings are not" + "anagram of each other.");
//         }
//     }
// }

//Only theoritical explanation of above code
// import java.util.Scanner;

// public class Lecture6_areAnagram {
//     static final int CHAR = 256;
//     static boolean areAnagram(String s1, String s2)
//     {
//         int count[] = new int[CHAR];
//         for(int i=0;i<s1.length();i++)
//         {
//             int x= s1.charAt(i);
//             int y= s2.charAt(i);
//             System.out.println("s1.charAt("+i+ ") represents: "+s1.charAt(i)+" and index at which "+s1.charAt(i)+ " is stored in count array is: "+x + "and value at that index is: " +count[x]);
//             count[s1.charAt(i)]++;
//             System.out.println("After increment of s1 string value"+count[x]);
//             System.out.println("s2.charAt("+i+ ") represents: "+s2.charAt(i)+" and index at which "+s2.charAt(i)+ " is stored in count array is: "+y + "and value at that index is: " +count[y]);
//             count[s2.charAt(i)]--;
//             System.out.println("After decrement of s2 string value"+count[y]);
//             System.out.println("*************Next iteration starts*************");
//         }
//         for(int i=0;i<CHAR; i++)
//         {
//             if(count[i]!=0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[])
//     {
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("Enter the string s1:");
//         String s1 = sc.nextLine();
//         System.out.println("Enter the string s2");
//         String s2 = sc.nextLine();
//         if(areAnagram(s1, s2))
//         {
//             System.out.println("The two strings are" + "anagram of each other.");
//         }
//         else
//         {
//             System.out.println("The two strings are not" + "anagram of each other.");
//         }
//     }
// }