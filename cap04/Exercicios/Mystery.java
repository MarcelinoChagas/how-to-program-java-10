package Exercicios;

public class Mystery {
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        System.out.println("Value-Y\tValue-X\tValue-Total\t");
        while (x <= 10) {
            int y = x * x;
//            System.out.println(y);
            total += y;
            ++x;
            System.out.printf("\t%d\t\t %d\t\t  %d\n",y,x,total);
        }
        System.out.printf("\nTotal is %d%n", total);
    }
} // fim da classe Mystery