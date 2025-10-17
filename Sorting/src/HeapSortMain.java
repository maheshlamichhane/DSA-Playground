public class HeapSortMain {

    public static void main(String[] args) {
        int[] array = {10,20,1,2,99};
        HeapSort hs = new HeapSort(array);
        hs.sort();
        hs.printArray(array);
    }
}
