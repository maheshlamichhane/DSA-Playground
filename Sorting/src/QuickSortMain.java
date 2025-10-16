public class QuickSortMain {

    public static void main(String[] args) {
        int[] array = {10,20,30,90,4,1};
        QuickSort.quickSort(array,0,array.length-1);
        QuickSort.printArray(array);
    }


}
