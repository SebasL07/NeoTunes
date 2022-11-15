package model;

public class Sale{

    private String nameBuyer;
    private Date buyDate;
    private String nameAudioBuyed;
    private double priceSale;

    public Sale(String nameBuyer, Date date, String nameAudioBuyed, double priceSale){

        this.nameBuyer = nameBuyer;
        this.buyDate = date;
        this.nameAudioBuyed = nameAudioBuyed;
        this.priceSale = priceSale;
    }

    public String toString(){
       
        return "Nombre del comprador: " + nameBuyer + "\n" +
        "Fecha de la compra: " + buyDate.toString() + "\n" + 
        "Nombre del audio: " + nameAudioBuyed + "\n" + 
        "Valor de compra: " + priceSale;
    }
}