package ss5_data_loop;

import java.util.Scanner;

public class Ex19_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String binary = "";
        while (num > 0) {
            binary = num % 2 + binary;
            num = num / 2;
        }
        System.out.println("Binary number is: " + binary);
    }
}
