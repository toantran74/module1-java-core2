package ss3_java_overview;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productName;
        do {
            System.out.println("Enter name Product: ");
            productName = sc.nextLine();
            if(productName.matches("\\d++")){
                System.out.println("Invalid Name!");
            }
        } while (productName.matches("\\d++"));

        System.out.println("So luong:");
        int amount = sc.nextInt();
        System.out.println("Don gia: :");
        double price = sc.nextDouble();
        // tinh tien
        double tien = amount * price;
        // tinh thue
        double thue = tien * 0.1;
        System.out.println("ten san pham: " + productName);
        System.out.println("so luong: " + amount);
        System.out.println("Thue: " + thue);


    }
    }

