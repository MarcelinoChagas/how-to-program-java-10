package Exercicios;

import java.util.Scanner;

public class MutipleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 double values separated by spaces: ");
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        System.out.println(isMultiple(value1, value2));
    }

    public static boolean isMultiple(double x, double y) {
        boolean value;
        if (x % y == 0) {
            System.out.println("[x % y] " + x + " is multiple this " + y);
            value = true;
        } else if (y % x == 0) {
            System.out.println("(y % x) " +y + " is multiple this " + x);
            value = true;
        } else {
            System.out.println("The values is not multiple");
            value = false;
        }

        return value;
    }
}
