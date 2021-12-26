package Algorythm.Java;
import java.util.Scanner;
import java.util.regex.*;

public class Java_Pattern_Syntax_Checker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
          	//Write your code
            try{
                String pattern = in.nextLine();
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");    
            }
            catch(PatternSyntaxException pse){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}



