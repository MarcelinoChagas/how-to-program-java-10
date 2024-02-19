package Exercicios;

public class Invoice {
    String number;
    String description;
    int qtd;
    double total;

    public Invoice(String number, String description, int qtd, double total) {
        this.number = number;
        this.description = description;

        if(qtd > 0) {
            this.qtd = qtd;
        } else if (qtd <= 0) {
            this.qtd = 0;
        }
        if(total > 0 ){
            this.total = total;
        } else if (total <= 0) {
            this.total = 0;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public void getInvoiceAmount(){
        System.out.println("Total Invoice:");
        System.out.printf("Number: %s\n" +
                          "Description: %s\n" +
                          "Price: %.2f\n"+
                          "Qtd.: %d\n" +
                          "Total: %.2f\n",
                getNumber(),getDescription(),getTotal(),getQtd(),(getTotal()*getQtd()));
    }
}