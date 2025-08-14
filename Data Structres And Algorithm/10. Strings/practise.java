public class practise {
    public static void main(String args[])
    {
        String s1= "aabca";
        int CHAR= 123;
        int count[] = new int[CHAR];
        System.out.println("Hello");
        for(int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
            System.out.println(count[s1.charAt(i)]+" ");
        }
        int x = s1.charAt(0);
        System.out.println("value of x is: "+x);
        System.out.println(s1.charAt(1));
    }
}
