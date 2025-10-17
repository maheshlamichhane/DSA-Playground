public class LinearSearch {

    int[] array;

    public LinearSearch(int[] array){
        this.array = array;
    }

    public void search(int value){
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");

        // Time Complexity O(n),Space Complexity O(1)
    }

}
