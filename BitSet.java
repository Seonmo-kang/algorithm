import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Using BitSet class
    Operation 
    1. AND
    2. OR
    3. FLIP
    4. SET
    
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int bitNum = sc.nextInt();
        BitSet bset = new BitSet(bitNum);
        BitSet bset2 = new BitSet(bitNum);
        BitSet[] bsetArr = new BitSet[2];
        bsetArr[1] = bset;
        bsetArr[2] = bset2;
        int loopNum = sc.nextInt();
        for(int i =0; i<loopNum;i++){
            String oper = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch(oper){
                case "AND":
                    bsetArr[x].and(bsetArr[y]);
                    System.out.println(bsetArr[1]+" "+bsetArr[2]);
                    break;
                case "OR":
                    bsetArr[x].or(bsetArr[y]);
                    System.out.println(bsetArr[1]+" "+bsetArr[2]);
                    break;
                case "XOR":
                    bsetArr[x].xor(bsetArr[y]);
                    System.out.println(bsetArr[1]+" "+bsetArr[2]);
                    break;
                case "FLIP":
                    bsetArr[x].flip(y);
                    System.out.println(bsetArr[1]+" "+bsetArr[2]);
                    break;
                case "SET":
                    bsetArr[x].set(y);
                    System.out.println(bsetArr[1]+" "+bsetArr[2]);
                    break;
            }
    }
}