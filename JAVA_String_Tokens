import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String str = "[ !,?.\\_'@]+";
        String s_trim = s.trim();
        if (s.trim().length()==0){
            System.out.println("0");
            return;
        }
        String[] token = s_trim.split(str);
        System.out.println(token.length);
        // When using array String, length;
        // When using String, length();
        if(token.length!=0){
            for(String ss:token){
                System.out.println(ss);
            }
        }
        scan.close();
    }
}

