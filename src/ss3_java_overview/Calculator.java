package ss3_java_overview;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        Integer soA = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so b: ");
        Integer soB = Integer.parseInt(sc.nextLine());
        int sum = soA + soB;
        int effect = soA - soB;
        int mul = soA * soB;
        double div = (double) soA / soB;
        System.out.printf("%d + %d = %d", soA, soB, soA + soB);
        System.out.println();
        System.out.println("Hieu: " + effect);
        System.out.println("Tich: " + mul);
        System.out.println("Thuong: " + div);
    }
}
