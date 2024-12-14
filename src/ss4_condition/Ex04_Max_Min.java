package ss4_condition;

import java.util.Scanner;

public class Ex04_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        // if_else
//        if (num1 > num2) {
//            System.out.println("Max = " + num1);
//            System.out.println("Min = " + num2);
//        }
//        else {
//            System.out.println("Max = " + num2);
//            System.out.println("Min = " + num1);
//        }
        // 3 ngoi
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
