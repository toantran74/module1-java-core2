package ss5_data_loop;

import java.util.Scanner;

public class Ex05_PrintEvenNumber_2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 2; i < 2 * n; i += 2) {
            System.out.print(i + "\t");
        }
    }
}
