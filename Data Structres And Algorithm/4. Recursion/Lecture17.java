                                        //Print all the permutations of a string
                                        
public class Lecture17{
    static void permute(char [] s, int i){
        if(i==s.length-1){
            System.out.println(new String(s)); // Convert char array to string
            return ;
        }
        for(int j=i; j<s.length; j++){
            swap(s, i, j);               // Swap characters
            permute(s, i+1);
            swap(s, i, j);               // Backtrack (undo the swap)
        }
    }
    static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public static void main(String[] args) {
        int i=0;
        String str= "ABCD";
        permute(str.toCharArray(), 0);          // Convert string to char array
    }
}