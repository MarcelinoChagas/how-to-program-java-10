package Exercicios;

public class Invoice_Test {
    public static void main(String[]args){
        Invoice invoce1 = new Invoice("00001","Cueca",2,5.50);
        Invoice invoce2 = new Invoice("00002","Calcinha",-1,10.0);
        Invoice invoce3 = new Invoice("00003","Fiofo",4,-2.0);

        invoce1.getInvoiceAmount();
        System.out.println();
        invoce2.getInvoiceAmount();
        System.out.println();
        invoce3.getInvoiceAmount();
    }
}
