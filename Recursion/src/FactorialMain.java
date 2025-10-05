//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FactorialMain {




    public static int getFactorialWithoutRecursion(int num) throws Exception {
        int sum = 1;
            handleInvalidInput(num);
            if(num == 1){
                return 1;
            }
            else{
                for(int i=num;i>=1;i--){
                    sum *= i;
                }
            }
        return sum;
    }

    public static int getFactorialWithRecursion(int num) throws Exception {
        handleInvalidInput(num);
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * getFactorialWithRecursion(num-1);
        }
    }


    public static void main(String[] args) {

        try{
            // without recursion
            int factorial1 = getFactorialWithoutRecursion(5);
            System.out.println(factorial1);

            // with recursion
            int factorial2 = getFactorialWithRecursion(5);
            System.out.println(factorial2);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


    private static void handleInvalidInput(int num) throws Exception {
            if(num < 1){
                throw new Exception("invalid no provided");
            }
    }
}