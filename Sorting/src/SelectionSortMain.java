public class SelectionSortMain {

    public static void main(String[] args) {

        int[] arr = {10,12,15,48,99,101,2,53};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        selectionSort.printArray(arr);

    }
}
