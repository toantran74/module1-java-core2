package ss3_java_overview;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham:");
        String tenSP = sc.nextLine();
        System.out.println("So luong:");
        int sl = sc.nextInt() ;
        System.out.println("Don gia: :");
        double price = sc.nextDouble() ;
        // tinh tien
        double tien = sl * price;
        // tinh thue
        double thue = tien * 0.1;
        System.out.println("ten san pham: " + tenSP);
        System.out.println("so luong: " + sl);
        System.out.println("Thue: " + thue);


    }
}
