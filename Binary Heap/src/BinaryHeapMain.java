public class BinaryHeapMain {
    public static void main(String[] args) {


//        BinaryHeapWithArray binaryHeap = new BinaryHeapWithArray(5);
//        binaryHeap.insert(5,"Min");
//        binaryHeap.insert(10,"Min");
//        binaryHeap.insert(15,"Min");
//        binaryHeap.insert(1,"Min");
//        binaryHeap.levelOrder();
//        binaryHeap.extractHeadOfBinaryHeap("Min");
//        binaryHeap.levelOrder();

        BinaryHeapWithArray binaryHeap = new BinaryHeapWithArray(5);
        binaryHeap.insert(5,"Max");
        binaryHeap.insert(10,"Max");
        binaryHeap.insert(15,"Max");
        binaryHeap.insert(1,"Max");
        binaryHeap.levelOrder();
        binaryHeap.extractHeadOfBinaryHeap("Max");
        binaryHeap.levelOrder();


    }
}