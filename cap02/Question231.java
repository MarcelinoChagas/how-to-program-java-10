import java.util.Scanner;

/*(Tabela de quadrados e cubos) Utilizando apenas as técnicas de programação que aprendeu neste capítulo, escreva um aplicativo que
calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir: */

public class Question231 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("number\tsquare\tcube");
        int num = 0;
        while (num <= 10) {
            System.out.printf("\n%d\t%d\t%d", num, (num * num), (num * num * num));
            num++;
        }
    }
}