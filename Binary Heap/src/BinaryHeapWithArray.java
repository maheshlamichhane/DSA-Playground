public class BinaryHeapWithArray {

    public int[] array;
    int sizeOfTree;

    public BinaryHeapWithArray(int size){
        array = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap Created");

        // Time Complexity O(1),Space Complexity O(n)
    }

    //isEmpty
    public boolean isEmpty(){
        if(this.sizeOfTree == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Binary Heap Empty");
            return  null;
        }
        else{
            return array[1];
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public int sizeOfBinaryHeap(){
        return sizeOfTree;
    }

    public void levelOrder(){
        for(int i = 1; i<=sizeOfTree; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // Time Complexity O(n),Space Complexity O(1)
    }

    // Heapify for insert
    public void heapifyBottomToTop(int index,String heapType){
        int parent = index/2;
        if(index <= 1){
            return;
        }
        if(heapType.equals("Min")) {
            if (array[index] < array[parent]) {
                int temp = array[index];
                array[index] = array[parent];
                array[parent] = temp;
            }
        }
        else if(heapType.equals("Max")) {
            if (array[index] > array[parent]) {
                int temp = array[index];
                array[index] = array[parent];
                array[parent] = temp;
            }
        }
        heapifyBottomToTop(parent,heapType);
        //Time Complexity O(1),Space Complexity O(1)
    }




    public void insert(int value,String typeHeap){
        array[++sizeOfTree] = value;
        System.out.println("Inserted "+value);
        heapifyBottomToTop(sizeOfTree,typeHeap);

        // Time Complexity O(logn),Space Complexity O(logn)
    }


    public void heapifyTopToBottom(int index,String heapType){
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if(sizeOfTree < left){
            return;
        }
        if(heapType.equals("Max")){
            if(sizeOfTree == left){
                if(array[index] < array[left]){
                    int temp = array[index];
                    array[index] = array[left];
                    array[left] = temp;
                }
                return;
            }
            else{
                if(array[left] > array[right]){
                    swapChild = left;
                }
                else{
                    swapChild = right;
                }
                if(array[index] < array[swapChild]){
                    int temp = array[index];
                    array[index] = array[swapChild];
                    array[swapChild] = temp;
                }
            }
        }

        else if(heapType.equals("Min")){
            if(sizeOfTree == left){
                if(array[index] > array[left]){
                    int temp = array[index];
                    array[index] = array[left];
                    array[left] = temp;
                }
                return;
            }
            else{
                if(array[left] < array[right]){
                    swapChild = left;
                }
                else{
                    swapChild = right;
                }
                if(array[index] > array[swapChild]){
                    int temp = array[index];
                    array[index] = array[swapChild];
                    array[swapChild] = temp;
                }
            }
        }

        heapifyTopToBottom(swapChild,heapType);
    }

    public int extractHeadOfBinaryHeap(String heapType){
        if(isEmpty()){
            return -1;
        }
        else{
            int extracted = array[1];
            array[1] = array[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1,heapType);
            return extracted;
        }

        // Time Complexity O(logn),Space Complexity O(logn)
    }


    public void deleteBinayHeap(){
        array = null;
        // Time Complexity O(1),Space Complexity O(1)
    }















}
