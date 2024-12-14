package ss4_condition;

import java.util.Scanner;

public class Ex08_Month_In_Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        double month = sc.nextDouble();
        System.out.print("Enter the year: ");
        double year = sc.nextDouble();
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("The month there is 30 days in the year");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("The month there is 29 days in the year");
            } else {
                System.out.println("The month there is 28 days in the year");
            }
        } else {
            System.out.println("The month there is 31 days in the year");
        }
    }
}
