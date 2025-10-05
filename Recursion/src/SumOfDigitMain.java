public class SumOfDigitMain {

    public static void main(String[] args) {

        // without recursion
        System.out.println("Sum of digit="+sumOfDigitWithoutRecursion(12999));

        // with recursion
        System.out.println("Sum of digit="+sumOfDigitWithRecursion(12999));
    }

    private static double sumOfDigitWithRecursion(int num){
        if(num<0) {
            return 0;
        }
        if( num == 0){
            return 0;
        }
        return num % 10 + sumOfDigitWithRecursion(num/10);
    }


    private static double sumOfDigitWithoutRecursion(int num){
        double sum = 0.0;
        if(num<0) {
            return 0;
        }
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
