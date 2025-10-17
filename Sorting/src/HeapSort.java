public class HeapSort {

    public int[] array;

    public HeapSort(int[] array) {
        this.array = array;
    }

    public void sort(){
        BinaryHeapWithArray binaryHeapWithArray = new BinaryHeapWithArray(array.length);
        for(int i=0; i<array.length; i++){
            binaryHeapWithArray.insert(array[i],"Max");
        }
        for(int i=0; i<array.length;i++){
            array[i] = binaryHeapWithArray.extractHeadOfBinaryHeap("Max");
        }

        // Time Complexity O(NlogN),Space Complexity O(1)
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
