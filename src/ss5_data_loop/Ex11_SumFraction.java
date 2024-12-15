package ss5_data_loop;

import java.util.Scanner;

public class Ex11_SumFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        double sum = 0.0d;
        for (int i = 1; i <= num; i++) {
            int factor = 1;
            for (int j = 1; j <= (2 * i - 1); j++) { // (2*i-1) oddNumber
                factor *= j;
            }
            sum += factor;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
