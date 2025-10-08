public class LinearQueueWithArray {

    public int[] array;
    int beginningOfQueue;
    int topOfQueue;

    public void create(int size){
        array = new int[size];
        beginningOfQueue = -1;
        topOfQueue = -1;

        // Time Complexity O(1),Space Complexity O(n)
    }

    public boolean isEmpty(){
        if(beginningOfQueue == -1 || beginningOfQueue == array.length-1){
            return true;
        }
        else{
            return false;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public boolean isFull(){
        if(topOfQueue == array.length-1){
            return true;
        }
        else{
            return false;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }


    public void Enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(isEmpty()){
           beginningOfQueue = 0;
           topOfQueue = 0;
           array[topOfQueue] = value;
        }
        else{
            topOfQueue++;
            array[topOfQueue] = value;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int value = array[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return value;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return array[beginningOfQueue];
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void deleteQueue(){
        array = null;
        // Time Complexity O(1), Space Complexity O(1)
    }


}
