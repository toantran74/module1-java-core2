package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Calculation_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao nam sinh cua ban: ");
        int year = sc.nextInt();
        System.out.println("Tuoi cua ban la: " + (Year.now().getValue() - year));
    }
}
