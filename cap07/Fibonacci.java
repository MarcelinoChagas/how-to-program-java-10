import java.util.Scanner;
public class Fibonacci {
    public static int fibonacci(int number) {
        if (number < 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para verificar o fibonnaci: ");
        int n = input.nextInt();
        for (int i = 0; i<n;i++){
            System.out.printf("%d ", fibonacci(i) * -1);
        }
    }
}
