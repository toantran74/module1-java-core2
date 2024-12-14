package ss4_condition;

import java.util.Scanner;

public class Ex11_NextDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = sc.nextInt();
        System.out.println("Enter a month: ");
        int month = sc.nextInt();
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        }
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year");
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Invalid month");
                return;
            }
        }
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Invalid day");
                    return;
                } else if (day > 28) {
                    System.out.println("Invalid day");
                    return;
                }
            }
        }
        System.out.println("Valid day");
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        nextDay++;
        if (nextDay > 31 || (month == 2 && nextDay > (isLeapYear ? 29 : 28))
                || (month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30) {
            nextDay = 1;
            nextMonth++;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("Next day: %d/%d/%d", nextDay, nextMonth, nextYear);
        int dayBefore = day;
        int monthBefore = month;
        int yearBefore = year;
        dayBefore--;

        if (dayBefore < 1) {
            monthBefore--;
            if (monthBefore < 1) {
                monthBefore = 12;
                yearBefore--;
            }
            if (monthBefore == 4 || monthBefore == 6 || monthBefore == 9 || monthBefore == 11) {
                dayBefore = 30;
            } else if (monthBefore == 2) {
                if (isLeapYear) {
                    dayBefore = 29;
                } else {
                    dayBefore = 28;
                }
            } else {
                dayBefore = 31;
            }
        }
        System.out.printf("Day before: %d/%d/%d", dayBefore, monthBefore, yearBefore);
    }
}
