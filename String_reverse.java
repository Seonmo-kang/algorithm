import java.io.*;
import java.util.*;

public class String_reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (A.charAt(0)==A.charAt(A.length()-1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}



