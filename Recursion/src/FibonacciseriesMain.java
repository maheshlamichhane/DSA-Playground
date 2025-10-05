public class FibonacciseriesMain {

    public static void main(String[] args) {

        // without recursion
        System.out.println(getFiboSeriesWithoutRecursion(5));

        // with recursion
        System.out.println(getFiboSeriesWithRecursion(5));
    }

    private static int getFiboSeriesWithRecursion(int num){
        if(num < 0){
            return -1;
        }
        if(num == 1 || num == 0){
            return 1;
        }

        return getFiboSeriesWithRecursion(num - 1) + getFiboSeriesWithRecursion(num - 2);
    }

    private static StringBuffer getFiboSeriesWithoutRecursion(int num){
        StringBuffer stringBuffer = new StringBuffer();
        int prev = 0;
        stringBuffer.append(prev);
        int current = 1;
        stringBuffer.append(current);
        int result = 0;
        for(int i=2; i<num; i++){
            result = prev+current;
            prev = current;
            current = result;
            stringBuffer.append(result);
        }
        return stringBuffer;
        // 01123
    }
}
