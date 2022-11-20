package model;
import java.util.Calendar;


public class Sale{

    private String nameBuyer;
    private Calendar buyDate;
    private Song buyedSong;

    public Sale(String nameBuyer, Song song){

        this.nameBuyer = nameBuyer;
        this.buyDate = Calendar.getInstance();
        
        
    }

    public String toString(){
       
        return "Nombre del comprador: " + nameBuyer + "\n" +
        "Información de la cancion: \n "+ 
        buyedSong.toString();
        
    }

    public Song getBuyedSong(){
        return buyedSong;
    }
}