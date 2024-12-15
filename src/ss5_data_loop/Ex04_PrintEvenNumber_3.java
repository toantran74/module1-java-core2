package ss5_data_loop;

import java.util.Scanner;

public class Ex04_PrintEvenNumber_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        // c1
//        for (int i = 2; i <= num; i += 2) {
//            if (i % 6 == 0) {
//                System.out.print(-i + "\t");
//            } else {
//                System.out.print(i + "\t");
//            }
//        }
        // c2
        int distance = 3;
        int count = 0;
        for (int i = 2; i <= num; i += 2) {
            count++;
            if (count == distance) {
                System.out.print(-i + "\t");
                count = 0;
            } else {
                System.out.print(i + "\t");
            }
        }
//        int count = 0;
//        int temp = 4;
//        for(int i = 1; i <= num; i+=2){
//            count ++;
//            if(temp == count){
//                System.out.print(-i+"\t");
//                count = 0;
//            }
//            else {
//                System.out.print(i+"\t");
//            }
//     }
    }
}
