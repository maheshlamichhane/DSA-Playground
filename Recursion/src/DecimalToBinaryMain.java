public class DecimalToBinaryMain {

    public static void main(String[] args) {

        // without recursion
        System.out.println(getBinaryWithoutRecursion(15));

        // with recursion
        System.out.println(getBinaryWithRecursion(64));
    }

    private static StringBuffer getBinaryWithoutRecursion(int num){
        StringBuffer stringBuffer = new StringBuffer();
        while(num != 0){
            stringBuffer.append(num % 2);
            num = num / 2;
        }
        return stringBuffer.reverse();
    }

    private static int getBinaryWithRecursion(int num){
        if( num == 0){
            return 0;
        }
        return num % 2 + 10 * getBinaryWithRecursion(num/2);
    }
}
