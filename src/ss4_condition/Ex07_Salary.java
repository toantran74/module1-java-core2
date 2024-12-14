package ss4_condition;

import java.util.Scanner;

public class Ex07_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap TNCT: ");
        double year = sc.nextDouble();
        double salaryBasic = 650000;
        double salaryNew, coeffi;
        if (year < 12) {
            coeffi = 1.92;
        } else if (year < 36) {
            coeffi = 2.34;
        } else if (year < 60) {
            coeffi = 3;
        } else {
            coeffi = 4.5;
        }
        salaryNew = coeffi * salaryBasic;
        System.out.println("Luong cua nhan la: " + salaryNew);
    }
}
