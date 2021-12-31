import java.util.*;
public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        long[] numArr = new long[10000001];
        int n = in.nextInt();
        int m = in.nextInt();
        long max =0;
        long sub =0;
        for (int i = 0; i < n; i++) {
            if (i >= m){
                int lastQue = deque.removeLast();
                if (numArr[lastQue] >= 1){
                    numArr[lastQue]--;
                    if(numArr[lastQue]==0){
                        sub--;
                    }
                }
            }
            
            int num = in.nextInt();
            deque.addFirst(num);
            if(numArr[num]==0){
                sub++;
                max = Math.max(sub,max);
            }
            numArr[num]++;
        }
        System.out.println(max);
        in.close();
    
    
    }
}



