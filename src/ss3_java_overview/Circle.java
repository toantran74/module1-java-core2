package ss3_java_overview;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2); // Math.PI * radius * radius

        System.out.println("The area of the circle is " + area);
        System.out.println("The perimeter of the circle is " + perimeter);

    }
}
