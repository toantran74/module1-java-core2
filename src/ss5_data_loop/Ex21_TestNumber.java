package ss5_data_loop;

import java.util.Scanner;

public class Ex21_TestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

//        String str = Integer.toString(num);
//        boolean flag = true;
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                flag = false;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println("The number is: " + num);
//        } else {
//            System.out.println("The number not is: " + num);
//        }
//        boolean isPrime = true;
//        if (num < 2) {
//            isPrime = false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (isPrime) {
//            System.out.println(num + " is a prime number");
//        } else {
//            System.out.println("Not a prime number");
//        }

        String s = Integer.toString(num);
        boolean flag = true;
        if (s.length() == 1) {
            flag = false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The number is increase");
        } else {
            System.out.println("The number is't increase");
        }
    }
}
