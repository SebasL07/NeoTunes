package model;

public class Sale{

    private String nameBuyer;
    private Date buyDate;
    private Song buyedSong;

    public Sale(String nameBuyer, Date date, Song song){

        this.nameBuyer = nameBuyer;
        this.buyDate = date;
        buyedSong = song;
        
    }

    public String toString(){
       
        return "Nombre del comprador: " + nameBuyer + "\n" +
        "Fecha de la compra: " + buyDate.toString() + "\n" + 
        "Información de la cancion: \n "+ 
        buyedSong.toString();
        
    }
}