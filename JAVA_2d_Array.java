import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JAVA_2d_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int[][] array = new int[6][6];
        int r_count=0;
        int c_count=0;
        for( List<Integer> array_s : arr){
            for( int s : array_s ){
                array[c_count][r_count]= s;
                r_count++;
                System.out.print(s+" ");                
            }
            System.out.println("\n");
            r_count=0;
            c_count++;
        }
        
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int loop_sum = array[i][j]+array[i][j+1]+array[i][j+2]+
                                     array[i+1][j+1]+
                                array[i+2][j]+array[i+2][j+1]+array[i+2][j+2];
                System.out.print("Column "+i+"th,"+"Row "+j+"th :"+loop_sum+"\t");
                if(i==0&&j==0||loop_sum>sum){
                    sum = loop_sum;
                }
            }
        }
        System.out.println(sum);
        bufferedReader.close();
        System.in.close();
    }
}
