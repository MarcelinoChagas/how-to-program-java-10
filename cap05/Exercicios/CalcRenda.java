package Exercicios;

import java.util.Scanner;

public class CalcRenda {
    public static void ListaProdutos() {
        System.out.println("LOJA BORRACHA\n" +
                "1 - Produto 1 - US$ 2,98\n" +
                "2 - Produto 2 - US$ 4,50\n" +
                "3 - Produto 3 - US$ 9,98\n" +
                "4 - Produto 4 - US$ 4,49\n" +
                "5 - Produto 5 - US$ 6,87");
    }

    public static void CalculaProduto() {
        int buy = 1;
        float totalVendas = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite o número do produto: ");
            int produto = input.nextInt();

            System.out.print("Digite a quantidade do produto: ");
            double qtd = input.nextDouble();
            System.out.println();
            switch (produto) {
                case 1:
                    totalVendas += (float) (qtd * 2.98);
                    break;
                case 2:
                    totalVendas += (float) (qtd * 4.50);
                    break;
                case 3:
                    totalVendas += (float) (qtd * 9.98);
                    break;
                case 4:
                    totalVendas += (float) (qtd * 4.49);
                    break;
                case 5:
                    totalVendas += (float) (qtd * 6.87);
                    break;
                case 9:
                    buy = 0;
                    break;
                default:
                    System.out.println("Número de produto inválido\nDigite um número válido");
                    break;
            }
            System.out.println();
            System.out.print("Deseja comprar mais? (0-Nao,1-Sim): ");
            buy = input.nextInt();
        } while (buy != 0);
        System.out.printf("Total Vendas: %.2f", totalVendas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaProdutos();
        CalculaProduto();
    }
}
