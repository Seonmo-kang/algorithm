import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	//Write your code here
            boolean matcher_found = false;
			String pattern = "<(.+)>([^<]+)</\\1>";
                            // <(.+)> : It must be < any words more than one > , () means group#1 E.g. <h1>
                            // ([^<]+) : It means any words except < more than one.
                            // </\\1> : Form must be </ group#1 >, \\1 means group#1.
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(line);
            while(m.find()){        // Why do you use method m.find()?
                                    // Cause : repeat printing of matched express.
                System.out.println(m.group(2));
                matcher_found=true;
            }
            if(!matcher_found){
                System.out.println("None");
            }
			testCases--;
		}
	}
}



