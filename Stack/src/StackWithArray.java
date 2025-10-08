public class StackWithArray {

    public int[] array;
    public int topOfStack;

    public void create(int size){
        array = new int[size];
        topOfStack = -1;

        // Time Complexity O(1),Space Complexity O(n)
    }

    public boolean isFull(){
        if(topOfStack == array.length-1){
            return true;
        }
        else{
            return false;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        else{
            return false;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Full");
        }
        else{
            array[++topOfStack] = value;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        else{
            --topOfStack;
        }
        // Time Complexity O(1), Space Complexity O(1)

    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        }
        else{
            return array[topOfStack];
        }

        // Time Complexity O(1), Space Complexity O(1)
    }


    public void deleteStack(){
        array = null;
        topOfStack = -1;

        // Time Complexity O(1), Space Complexity O(1)
    }

}
