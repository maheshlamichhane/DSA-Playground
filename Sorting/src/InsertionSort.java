public class InsertionSort {

    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j= i;
            while(j > 0 && arr[j] < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }

        // Time Complexity O(N2),Space Complexity O(1)
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
