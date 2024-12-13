package ss4_condition;

import java.util.Scanner;

public class Ex5_bac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("PTVN");
        } else {
            System.out.println("Phuong trinh co nghiem la: " + ((double) -b / a));
        }
    }
}
