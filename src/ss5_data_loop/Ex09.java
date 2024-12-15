package ss5_data_loop;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int a = 0;
        int distance = 2;
        int count = 0;
        while (a <= num) {
            count++;
            a = 2 * a + 1;
            if (count == distance) {
                System.out.print(-a + "\t");
                count = 0;
            }
            else {
                System.out.print(a + "\t");
            }
        }
    }
}
