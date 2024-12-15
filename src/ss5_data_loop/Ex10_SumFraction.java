package ss5_data_loop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10_SumFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        double sum = 0.0d;
        for (double i = 1; i <= num1; i++) {
            sum += 1 / i;
        }
        System.out.println("The sum fraction is " + sum);
    }
}
