
public class BubbleSortMain {
    public static void main(String[] args) {

        int array[] = {10,50,30,20,5,60,23};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        bubbleSort.printArray(array);

    }
}