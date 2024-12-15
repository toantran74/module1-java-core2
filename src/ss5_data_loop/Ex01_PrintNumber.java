package ss5_data_loop;

import java.util.Scanner;

public class Ex01_PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
        }
    }
}
