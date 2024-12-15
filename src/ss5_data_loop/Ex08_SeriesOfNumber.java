package ss5_data_loop;

import java.util.Scanner;

public class Ex08_SeriesOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter the number : ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (!(num > 1 && num < 999999)) {
                    System.out.println("Vui lòng nhập số trong khoảng cho phép!");
                }
            } else {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
                num = 0;
                sc.nextLine();// thua enter
            }
        } while (!(num > 1 && num < 999999));

        int f = 1;
//        while(f <= num){
//            System.out.print(f + "\t");
//            f = f * 2 + 1;
//        }
        do {
            System.out.print(f + "\t");
            f = 2 * f + 1;
        } while (f <= num);
    }
}
