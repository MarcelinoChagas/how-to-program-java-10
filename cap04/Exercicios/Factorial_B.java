package Exercicios;

import java.util.Scanner;

public class Factorial_B {
    public static void main(String[] args) {
        double number;
        int count = 0;
        double sum = 0;
        // Question B
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextDouble();
        System.out.println("The number is " + number);
        // Question B
        while (number >= count){
            int factorial = 1;
            int count2 = 1;

            while ( count2 <= count){
                factorial *= count2;
                count2++;
            }

            sum += 1.0/factorial;
            count++;
        }
        System.out.printf("result: %.2f",sum);
    }
}
