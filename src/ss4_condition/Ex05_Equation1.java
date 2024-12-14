package ss4_condition;

import java.util.Scanner;

public class Ex05_Equation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("PTVSN");
        } else if (a != 0 && b == 0) {
            System.out.println("PTVN");
        } else {
            System.out.println("Phuong trinh co nghiem la: " + ((double) -b / a));
        }
    }
}
