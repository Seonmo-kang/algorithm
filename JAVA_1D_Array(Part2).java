import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int i) {
        // Return true if you can win the game; otherwise, return false.
        /*
            How to solve this problem?
             - Using DFS Deepth First Searching
             - Using Recursive Cases

             return canWin function to continue searching.
             재귀함수가 멈출때는 언제인가?
                    -  A stop condition :the function returns a 
                        value when a certain condition is satisfied, without a further recursive call
                    - The Recursive Call – the function calls itself with an input which is a step
                        closer to the stop condition

         */
        if(i>=game.length){
            return true;
        }
        if(i<0 || game[i]==1){
            return false;
        }
        game[i]=1;
        return (canWin(leap, game, i-1) || canWin(leap, game, i+1) || canWin(leap, game, i+leap));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}