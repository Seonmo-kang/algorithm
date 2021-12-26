package Algorythm.Java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Java_Regex{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex
{
    String ip_pattern = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = ip_pattern+"."+ip_pattern+"."+ip_pattern+"."+ip_pattern;
}
