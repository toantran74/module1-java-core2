package ss5_data_loop;

import java.util.Scanner;

public class Ex20_SumFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        System.out.print("Enter the number c : ");
        int c = sc.nextInt();
        long sumFactorial = 0;
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int tempA = 1;
        int tempB = 1;
        int tempC = 1;
        for (int i = 1; i <= a; i++) {
            tempA *= i;
            sumA += tempA;
        }
        for (int i = 1; i <= b; i++) {
            tempB *= i;
            sumB += tempB;
        }
        for (int i = 1; i <= c; i++) {
            tempC *= i;
            sumC += tempC;
        }
        sumFactorial = sumA + sumB + sumC;
        System.out.println("sumFactorial: " + sumFactorial);
    }
}
