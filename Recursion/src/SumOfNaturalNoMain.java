public class SumOfNaturalNoMain {
    public static void main(String[] args) {


        // sum of digit without recursion
        System.out.println("Sum="+sumOfNaturalNoWithoutRecursion(5));

        // sum of digit with recursion
        System.out.println("Sum="+sumOfNaturalNoWithRecursion(5));
    }

    private static double sumOfNaturalNoWithRecursion(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfNaturalNoWithRecursion(num-1);
    }


    private static double sumOfNaturalNoWithoutRecursion(int num){
        double sum = 0.0;
        for(int i = 1; i<=num; i++){
            sum += i;
        }
        return sum;
    }
}
