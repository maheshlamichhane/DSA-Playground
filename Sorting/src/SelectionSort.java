public class SelectionSort {


    public void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int maximumIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] > arr[maximumIndex]){
                    maximumIndex = j;
                }
            }

            if(i != maximumIndex){
                int temp = arr[i];
                arr[i] = arr[maximumIndex];
                arr[maximumIndex] = temp;
            }
        }

        // Time Complexity O(N2),Space Complexity O(1)
    }



    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
