package ss3_java_overview;

import java.util.Scanner;

public class PointMedium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double math, physic, chemistry, coeffiMath, coeffiPhysic, coeffiChemistry;

        System.out.println("Enter math: ");
        math = sc.nextDouble();
        System.out.println("Enter Coeffi math: ");
        coeffiMath = sc.nextDouble();

        System.out.println("Enter physic: ");
        physic = sc.nextDouble();
        System.out.println("Enter Coeffi physic: ");
        coeffiPhysic = sc.nextDouble();

        System.out.println("Enter chemistry: ");
        chemistry = sc.nextDouble();
        System.out.println("Enter Coeffi chemistry: ");
        coeffiChemistry = sc.nextDouble();

        double point = (((math * coeffiMath) + (physic * coeffiPhysic) + (chemistry * coeffiChemistry))/(coeffiMath + coeffiPhysic + coeffiChemistry));
        System.out.println("The point is " + point);
    }
}
