package ss5_data_loop;

import java.util.Scanner;

public class Ex03_PrintEvenNumber_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "\t");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
