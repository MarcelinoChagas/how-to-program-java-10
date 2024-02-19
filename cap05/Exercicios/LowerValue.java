package Exercicios;

import java.util.Scanner;

public class LowerValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        double qtdValue = input.nextDouble();
        double minValue = 0;

        for (int i = 0; i < qtdValue; i++) {
            System.out.printf("Enter %d° value: ", i);
            double value = input.nextDouble();

            if (i == 0 || value < minValue)
                minValue = value;
        }
        System.out.printf("Lower value is %.2f", minValue);
    }
}
