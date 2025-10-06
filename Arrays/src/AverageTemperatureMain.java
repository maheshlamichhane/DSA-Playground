import java.util.Scanner;

public class AverageTemperatureMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days");
        int days = sc.nextInt();

        double sum = 0.0;
        for(int i=0; i<days; i++){
            System.out.println("Enter temperature for day "+(i+1));
            double temp = sc.nextDouble();
            sum += temp;
        }

        System.out.println("Average Temperature="+sum/days);

        // Time Complexity O(n) and Space Complexity O(1)
    }
}
