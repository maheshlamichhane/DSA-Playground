public class MissingNumberMain {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,8,9,10};
        System.out.println("Missing no="+findMissingNo(arr));

    }

    private static int findMissingNo(int[] arr){
        int sum1 = 0;
        for(int i=0; i<arr.length;i++){
            sum1 += arr[i];
        }

        int sum2 = arr[arr.length-1] * (arr[arr.length-1]+1);
        return sum2/2-sum1;
    }
}

