package ss4_condition;

import java.util.Scanner;

public class Ex10_SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        double num = sc.nextInt();
        double sqrtNum = Math.sqrt(num);
        if(Math.ceil(sqrtNum) == Math.floor(sqrtNum)){
            System.out.println("The number is a Square Number");
        }
        else{
            System.out.println("The number is not a Square Number");
        }
    }
}
