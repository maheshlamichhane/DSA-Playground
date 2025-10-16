public class BucketSortMain {

    public static void main(String[] args) {

        int[] array = {44,12,2,7,69,3,17,1,9};
        BucketSort obj = new BucketSort(array);
        obj.printArray();
        obj.bucketSort();
        obj.printArray();
    }
}
