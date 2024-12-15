package ss5_data_loop;

import java.util.Scanner;

public class Ex06_PrintEvenNumber_Difficult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        int distance = 2;
        for (int i = 2; i <= num; i += 2) {
            count++;
            if (distance == count) {
                System.out.print(-i + "\t");
                distance++;
                count = 0;
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
