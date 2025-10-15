public class BubbleSort {

    public void  bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Time Complexity O(n2),Space Complexity O(1)
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
