package model;

public class Song extends Audio{
    
    private String album;
    private double price;
    private int numSales;
    
    private Gender gender;

    public Song(String name, String imageURL, String duration, int numPlayed, String album, double price){
        super(name, imageURL, duration, numPlayed);

        this.album = album;
        this.price = price;
        numSales = 0;

    }

    @Override
    public String toString(){
        return super.toString() + 
        "Genero: " + gender + "\n" +  
        "Album: " + album + "\n"+ 
        "Precio: " + price + "\n" + 
        "Numero de ventas: " + numSales;
    }

    
}