package ss5_data_loop;

import java.util.Scanner;

public class Ex02_PrintOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
