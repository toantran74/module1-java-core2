package ss5_data_loop;

import java.util.Scanner;

public class poin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        do {
            System.out.println("Enter the poin of your student");
            x = sc.nextDouble();
            if(x < 0 || x > 10){
                System.out.println("Invalid input");
            }
        } while (x < 0 || x > 10);
        System.out.println(x);

    }
}
