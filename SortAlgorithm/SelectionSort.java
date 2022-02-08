package SortAlgorithm;
import java.util.Arrays;
public class SelectionSort {
    int[] list;
    SelectionSort(int[] list){
        this.list = list;
    }

    public int[] selectionSort() {
        int temp=0;

        int j=0;
            while(j<list.length-1){
                int min = j;
                for(int i=j+1;i<list.length;i++){
                    if(list[i]<list[min]){
                        min = i;
                    }
                }
                temp = list[j];
                list[j]=list[min];
                list[min] =temp;
                j++;
            }
            return list;
        }

    public void printArray(){
        System.out.println(Arrays.toString(list));
    } 
    public static void main(String[] args){
        int[] list = {6,4,26,12,16,10,9,4,1};
        SelectionSort selectionSort = new SelectionSort(list);
        selectionSort.selectionSort();
        selectionSort.printArray();
    }
}
