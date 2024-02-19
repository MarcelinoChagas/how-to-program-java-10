package Exercicios;

public class FormatTable {
    public static void main(String[]args){
        int number = 1;
        System.out.println("N\t10*N\t100*N\t1000*N");
        System.out.println();
        while (number <= 5){
            System.out.printf("%d\t%d\t\t%d\t\t%d\n",number,number*10,number*100,number*1000);
            number++;
        }
    }
}
