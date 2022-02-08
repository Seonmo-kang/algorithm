package SortAlgorithm;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * BubbleSort
 */
public class BubbleSort {
    int[] list;
    BubbleSort(int[] list){
        this.list = list;
    }
    public int[] bubbleSort(){
        int temp=0;
        for(int i=0;i<list.length-1;i++){
            for(int j=0; j<list.length-i-1;j++){
                if(list[j]>list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
    public void printSort() {
        System.out.println(Arrays.toString(list));
    }
    public static void main(String[] args) {
        int[] list = {5,4,3,2,1};
        BubbleSort bs = new BubbleSort(list);
        list = bs.bubbleSort();
        bs.printSort();
    }    
}
