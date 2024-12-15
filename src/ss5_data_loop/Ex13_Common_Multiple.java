package ss5_data_loop;

import java.util.Scanner;

public class Ex13_Common_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int common = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                common = i;
                break;
            } else {
                System.out.println("Not a Common!");
                break;
            }
        }
        int multiple = 0;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                multiple = i;
                break;
            } else {
                System.out.println("Not a Multiple!");
                break;
            }
        }
        System.out.println("Common a and b is: " + common);
        System.out.println("Multiple a and b is: " + multiple);

    }
}
