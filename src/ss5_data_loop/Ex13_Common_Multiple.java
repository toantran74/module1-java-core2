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
        int multiple = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                common = i;
                multiple = (a*b)/common;
                break;
            }
        }
        System.out.println("Common a and b is: " + common);
        System.out.println("Multiple a and b is: " + multiple);

    }
}
