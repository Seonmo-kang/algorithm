import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int maxProfit(int[] prices) {
        int max_value = Integer.MAX_VALUE;
        int best=0;
        int profit=0;
        for(int i=0; i<prices.length; i++){
            if( prices[i]<max_value ){
                max_value = prices[i];
            }
            profit = prices[i]-max_value;
            if(best < profit){
                 best = profit;
            }
        }
        return best;
    }
}