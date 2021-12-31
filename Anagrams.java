import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] array = new int[256];
        for( char c:a.toCharArray()){
                int i=(int)c;
                array[i]++;
            }
        for( char c:b.toCharArray()){
                int i=(int)c;
                array[i]--;  
            }
        for(int j:array){
            if (j!=0){
                return false;
            }
        }
        return true;
        }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
