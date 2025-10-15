public class InsertionSortMain {

    public static void main(String[] args) {

        int[] x = {10,2,4,66,99,12,45};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(x);
        insertionSort.printArray(x);
    }
}
