public class StackWithArray {

    public int[] array;
    public int topOfStack;

    public void create(int size){
        array = new int[size];
        topOfStack = -1;
    }

    public boolean isFull(){
        if(topOfStack == array.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Full");
        }
        else{
            array[++topOfStack] = value;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
        }
        else{
            --topOfStack;
        }
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        }
        else{
            return array[topOfStack];
        }
    }


    public void deleteStack(){
        array = null;
        topOfStack = -1;
    }

}
