package ss5_data_loop;

import java.util.Scanner;

public class Ex07_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        while (f3 <= n) {
            System.out.print(f3 + "\t");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
