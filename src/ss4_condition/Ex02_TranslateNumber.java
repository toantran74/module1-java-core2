package ss4_condition;

import java.util.Scanner;

public class Ex02_TranslateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = sc.nextInt();
        // Making 1: Switch-case
//        switch (num) {
//            case 1:
//                System.out.println("One");
//                break;
//            case 2:
//                System.out.println("Two");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//            case 4:
//                System.out.println("Four");
//                break;
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            case 10:
//                System.out.println("Ten");
//                break;
//            default:
//                System.out.println("Invalid Input => [1,10]");
//        }
        //Making 2: if-else
        if(num == 1){
            System.out.println("One");
        }
        else if(num == 2){
            System.out.println("Two");
        }
        else if(num == 3){
            System.out.println("Three");
        }
        else if(num == 4){
            System.out.println("Four");
        }
        else if(num == 5){
            System.out.println("Five");
        }
        else if(num == 6){
            System.out.println("Six");
        }
        else if(num == 7){
            System.out.println("Seven");
        }
        else if(num == 8){
            System.out.println("Eight");
        }
        else if(num == 9){
            System.out.println("Nine");
        }
        else if(num == 10){
            System.out.println("Ten");
        }
        else{
            System.out.println("Invalid Input => [1,10]");
        }

    }
}
