package Exercicios;

import java.security.SecureRandom;

public class ParOuImpar {
    public static void main(String[] args) {
        isEven();
    }

    public static void isEven() {
        SecureRandom randomNumbers = new SecureRandom();

        for (int i = 1; i < 20; i++) {
            int value = randomNumbers.nextInt(100);
            if (value % 2 == 0) {
                System.out.printf("\nThe value is %d and is TRUE", value);
            } else {
                System.out.printf("\nThe value is %d and is FALSE", value);
            }
        }

    }
}
