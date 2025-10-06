public class ProductOfMaximumNumMain {

    public static void main(String[] args) {

        int[] array = {1,2,5,7,8,9};
        System.out.println("Product of maximum no = "+findProductOfMaximumNo(array));

        // Time Complexity O(N2), Space Complexity O(1)

    }

    private static int findProductOfMaximumNo(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i] * arr[j]) > sum){
                    sum = (arr[i] * arr[j]);
                }
            }
        }
        return sum;
    }
}
