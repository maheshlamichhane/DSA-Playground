public class MergeSortMain {

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        MergeSort.mergeSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
