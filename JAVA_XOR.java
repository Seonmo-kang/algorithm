
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JAVA_XOR {

    public static String stringsXOR(String s, String t) {
        String res = new String("");
        String resTemp = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)){
                res = "0";
                resTemp = resTemp.concat(res);
            }
            else{
                res = "1";
                resTemp = resTemp.concat(res);
            }
        }
        return resTemp;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }

}



