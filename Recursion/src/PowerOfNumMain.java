public class PowerOfNumMain {

    public static void main(String[] args) {
        PowerOfNumMain num = new PowerOfNumMain();
        System.out.println(num.getPowerOfNumberWithRecursion(2,3));

        //without recursion
        System.out.println(num.getPowerOfNumberWithIteration(2,4));


    }

    public int getPowerOfNumberWithRecursion(int base,int exp) {
        if(exp<1) {
            return -1;
        }
        if(base<1) {
            return -1;
        }
        if(exp == 0) {
            return 1;
        }
        if(base == 0) {
            return 0;
        }
        if(base == 1) {
            return 1;
        }
        if(exp == 1) {
            return base;
        }
        return base*getPowerOfNumberWithRecursion(base,exp-1);
    }

    public int getPowerOfNumberWithIteration(int base,int exp) {
        if(exp<1) {
            return -1;
        }
        if(base<1) {
            return -1;
        }
        if(exp == 0) {
            return 1;
        }
        if(base == 0) {
            return 0;
        }
        if(base == 1) {
            return 1;
        }
        if(exp == 1) {
            return base;
        }
        int total=1;
        for(int i =exp; i>=1; i--) {
            total=total*base;
        }
        return total;
    }

}