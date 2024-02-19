package Exercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        double number;
        int factorial = 1;
        int count = 1;
        // Question A
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextDouble();
        System.out.println("The number is "+ number);

        while (number >= count){
            factorial *= count;
            count++;
        }
        System.out.println("Result "+ factorial);
        input.close();
    }
}
