package Algorythm.Java;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0; // Result variable
        // List<Integer> list = new ArrayList<Integer>();
        int[] arr = new int[n];
        // while(sc.hasNext()==true){
        //     int element = sc.nextInt();
        //     list.add(element);
        // }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            System.out.println("arr["+i+"] : "+arr[i]);
        }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < (arr.length-i+1); j++) {
                

               int[] subArr = Arrays.copyOfRange(arr, j, j+i);  
                /* Sub array :
                    Using - Arrays.copyOfRange(arr,from,to);
                */

               int temp = IntStream.of(subArr).sum();
                /*  Sum in array : 
                    Using - Intstream.of(int).sum();
                    *Can't put list in Intstream.of()
                */
                // IntStream.of(list.subList(j, j+i)).sum(); is the sample of not being able to make list in Intstream.of()

                if(temp<0){
                    System.out.println("temp is "+temp);    //For test
                    result++;   //Counting negative subarray 
                    System.out.println("result is "+result);//For test
                }
            }
        }
        System.out.println(result);
        sc.close();
    }
}