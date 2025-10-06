public class PermutationMain {

    public static void main(String[] args) {
        int[] arr1 = {6,5,3,4,2,1};
        int[] arr2 = {1,2,4,6,3,5};

        System.out.println(checkForPermutation(arr1,arr2));

        // Time Complexity O(n) and Space Complexity O(1)
    }

    private static boolean checkForPermutation(int[] arr1,int[] arr2){

        int product1 = 0;
        int sum1 = 0;
        int product2 = 0;
        int sum2 = 0;

        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                product1 *= arr1[i];
                sum1 += arr1[i];
                product2 *= arr2[i];
                sum2 += arr2[i];
            }
        }
        else {
            return false;
        }

        if(product1 == product2 && sum1 == sum2){
            return true;
        }
        else {
            return false;
        }
    }
}
