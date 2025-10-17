public class BinarySearch {

    public int[] array;
    BinarySearch(int[] array){
        this.array = array;
    }

    public boolean search(int value) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            System.out.println("start: " + start + " end: " + end + " middle: " + middle);

            if (array[middle] == value) {
                return true;
            } else if (value < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return false;
        // Time Complexity O(logN),Space Complexity O(1)
    }

}
