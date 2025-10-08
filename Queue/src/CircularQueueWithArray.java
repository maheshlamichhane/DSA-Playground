public class CircularQueueWithArray {

    public int[] array;
    public int beginningOfQueue;
    public int topOfQueue;

    public void create(int size){
        array = new int[size];
        beginningOfQueue = -1;
        topOfQueue = -1;

        // Time Complexity O(1), Space Complexity O(n)
    }

    public boolean isEmpty(){
        if(beginningOfQueue == -1){
            return true;
        }
        return false;

        // Time Complexity O(1), Space Complexity O(1)
    }

    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue ) {
            return true;
        }
        else if(beginningOfQueue == 0 && topOfQueue == array.length-1){
            return true;
        }
        else {
            return false;
        }

        // Time Complexity O(1),Time Complexity O(1)
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue = 0;
            array[topOfQueue] = value;
        }
        else{
            if(topOfQueue+1 == array.length){
                topOfQueue = 0;
            }
            else{
                topOfQueue ++;
            }
            array[topOfQueue] = value;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }


    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = array[beginningOfQueue];
            array[beginningOfQueue] = 0; // Optional: clearing value

            if(beginningOfQueue == topOfQueue){
                // Only one element was in the queue
                beginningOfQueue = topOfQueue = -1;
            } else {
                beginningOfQueue = (beginningOfQueue + 1) % array.length;
            }
            return value;
        }

        // Time Complexity O(1),Space Complexity O(1)
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return array[beginningOfQueue];

        // Time Complexity O(1),Space Complexity O(1)


    }

    public void deleteCircularQueue(){
        array = null;
        topOfQueue = -1;
        beginningOfQueue = -1;

        // Time Complexity O(1), Space Complexity O(1)
    }

}
