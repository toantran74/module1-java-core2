package ss5_data_loop;

import java.util.Scanner;

public class Ex12_Sum_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }
        System.out.println("The sum of the product is: " + sum);
        System.out.println("The product is: " + product);
    }
}
