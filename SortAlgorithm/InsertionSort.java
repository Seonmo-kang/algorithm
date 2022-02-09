import java.util.Arrays;
class InsertionSort{
    int[] list;
    InsertionSort(int[] list){
        this.list = list;
    }
    int[] insertionsSort(){
        for(int i =1; i<list.length; i++){
            int temp = list[i];
            int pre = i-1;
            while( pre>=0 && list[pre]>temp){
                list[pre+1]=list[pre];
                pre--;
            }
            list[pre+1]=temp;
        }
        return list;
    }
    void printList(){
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args){
        int[] list = {6,16,1,3,2,8};
        InsertionSort is = new InsertionSort(list);
        is.insertionsSort();
        is.printList();

    }
}