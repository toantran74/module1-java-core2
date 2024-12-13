package ss5_data_loop;

import java.util.Scanner;

public class In_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        for (int i = 1; i <= num; i = i + 2) {
                System.out.print(i + "\t");
        }
    }
}
