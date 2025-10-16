public class MergeSort {

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftTmpArray = new int[n1];
        int[] rightTmpArray = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftTmpArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightTmpArray[j] = array[middle + 1 + j];
        }

        // Merge the temp arrays back into original
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftTmpArray[i] <= rightTmpArray[j]) {
                array[k++] = leftTmpArray[i++];
            } else {
                array[k++] = rightTmpArray[j++];
            }
        }

        // Copy remaining elements, if any
        while (i < n1) {
            array[k++] = leftTmpArray[i++];
        }

        while (j < n2) {
            array[k++] = rightTmpArray[j++];
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    // Time Complexity O(NlogN),Space Complexity O(N)

}
