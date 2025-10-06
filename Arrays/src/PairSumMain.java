public class PairSumMain {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,8,9};
        pairSum(3,array);

        // Time Complexity O(N2) and Space Complexity O(1)

    }


    private static void pairSum(int sum,int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if((array[i] + array[j]) == sum){
                    System.out.println("Pair found for this "+sum+" values are "+array[i]+" and "+array[j]);
                }
            }
        }
    }
}
