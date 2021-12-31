import java.io.*;
import java.util.*;

public class List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int count = sc.nextInt();
        for(int i =0;i<count; i++){
            list.add(sc.nextInt());
        }
        int loop_num = sc.nextInt();
        for(int k=0;k<loop_num;k++){
            String func = sc.next();
            if(func.equals("Insert")){
                System.out.println("INSERT Processing...");
                int y = sc.nextInt();
                int x = sc.nextInt();
                list.add(y, x);
            }
            else if(func.equals("Delete")){
                System.out.println("Delete Processing...");
                int remove_num = sc.nextInt();
                System.out.println("remove_num");
                list.remove(remove_num);
            }
        }
        for(int j : list){
            System.out.print(j+" ");
        }
    }
}