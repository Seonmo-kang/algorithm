import java.io.*;
import java.util.*;

public class JAVA_Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<d;j++){
                row.add(sc.nextInt());
            }
            list.add(row);
        }
        int index_num = sc.nextInt();
        for(int q=0;q<index_num;q++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            try{
                System.out.println(list.get(y-1).get(x-1));
            }catch(IndexOutOfBoundsException ioobe){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}