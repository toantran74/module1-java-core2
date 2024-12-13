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
        int nhan = soA * soB;
        double chia = (double) soA / soB;
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + effect);
        System.out.println("Tich: " + nhan);
        System.out.println("Thuong: " + chia);
    }
}
