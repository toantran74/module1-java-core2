package ss4_condition;

import java.util.Scanner;

public class Ex06_Equation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a: :");
        double a = sc.nextInt();
        System.out.print("Enter a number b: :");
        double b = sc.nextInt();
        System.out.print("Enter a number c: :");
        double c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("PTVSN");
                } else {
                    System.out.println("PTVN");
                }
            } else {
                double x = -c / b;
                System.out.println("PT co 1 nghiem la: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PTVN");
            } else if (delta == 0) {
                System.out.println("PT co 1 nghiem kep la: " + -b / 2 * a);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("PT co 2 nghiem la: " + x1 + " - " + x2);
            }
        }
    }
}
