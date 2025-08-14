import java.util.Scanner;

public class Lecture16_strings_are_rotated_and_check_if_they_are_equal {
    static boolean areRotations(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        return((s1+s1).indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the rotated string");
        String s2 = sc.nextLine();
        System.out.println("Occurs or not: " + areRotations(s1,s2));
    }
}
