package ss4_condition;

import java.util.Scanner;

public class Ex09_Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char char2 = sc.next().charAt(0);
        if (char2 >= 'a' && char2 <= 'z' || char2 >= 'A' && char2 <= 'Z') {
            if (char2 >= 'a' && char2 <= 'z') {
                char2 -= 32;// Example: a= 97 -> A= 65, 97-32 = 65
            } else {
                char2 += 32;// Example B= 66 -> b= 98, 66+32 = 90
            }
            System.out.println("The character is " + char2);
        } else {
            System.out.println("Invalid input");
        }
    }
}
