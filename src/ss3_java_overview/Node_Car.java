package ss3_java_overview;

import java.util.Scanner;

public class Node_Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bienso of the car");
        int bien = sc.nextInt(); // 12345

        int sum = bien % 10; // sum = 5
        bien /= 10; // bien = 1234

        sum = sum + bien%10; // sum = 5 + 4
        bien = bien/10; // bien = 123

        sum = sum + bien%10; // sum = 9 + 3
        bien = bien/10; // bien = 12

        sum = sum + bien%10; // sum = 12 + 2
        bien = bien/10; // bien = 1

        sum = sum + bien%10; // sum = 14 + 1
        bien = bien/10; // bien = 0

        System.out.println("So nut cua xe la: " + sum % 10);
    }
}
