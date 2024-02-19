package Exercicios;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorialCalculated(int n){
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    public static void showFactorial(){
        System.out.println("Factorial\t\tNumber");
        for(int i = 1; i <= 100; i++){
            System.out.println(i + "\t\t\t\t" + factorialCalculated(i));
        }
    }

    public static void main (String[] args) {
        showFactorial();
    }
}
