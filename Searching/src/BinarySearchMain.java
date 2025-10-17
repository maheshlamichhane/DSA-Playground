public class BinarySearchMain {

    public static void main(String[] args) {
        int[] array = {10,3,44,5,99,4};
        BinarySearch binarySearch = new BinarySearch(array);
        boolean bool = binarySearch.search(44);
        if(bool){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
