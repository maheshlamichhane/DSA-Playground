public class OneDimensionalArray {

    private int[] array;
    private int size;

    public  OneDimensionalArray(int size){
        array = new int[size];
        this.size = size;
        // Time Complexity O(n), Space Complexity O(n)
    }

    public void traverse(){
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }
        // Time Complexity O(n), Space Complexity O(1)
    }

    public void search(int value){
        for(int i=0; i<size; i++){
            if(array[i] == value){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println(value + " is not found");

        // Time Complexity O(n),Space complexity O(1)

    }

    public void insert(int value,int position){
        if(position > size){
            System.out.println("Invalid index provided");
        }
        else{
            array[position-1] = value;
        }

        // Time complexity O(1),Space Complexity O(1)
    }

    public void delete(int position){
       if(position > size){
           System.out.println("Invalid index provided");
       }
       else{
           array[position-1] = Integer.MIN_VALUE;
           System.out.println("Element deleted successfully");
       }

       // Time Complexity O(1) and Space Complexity O(1)
    }


}
