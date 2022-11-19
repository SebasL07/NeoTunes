package model;

public class Song extends Audio{
    
    private String album;
    private double price;
    private int numSales;
    
    private Gender gender;

    public Song(String name, String imageURL, String duration, int numPlayed, String album, double price, int opGender){
        super(name, imageURL, duration, numPlayed);

        this.album = album;
        this.price = price;
        numSales = 0;

        switch (opGender) {
            case 1:
                gender = Gender.HOUSE;
                break;
            case 2: 
                gender = Gender.POP;
                break;
            case 3: 
                gender = Gender.ROCK;
                break;
            case 4: 
                gender = Gender.TRAP;
                break;
            
        }

    }

    @Override
    public String toString(){
        return super.toString() + 
        "Genero: " + gender + "\n" +  
        "Album: " + album + "\n"+ 
        "Precio: " + price + "\n" + 
        "Numero de ventas: " + numSales;
    }

    public double getPrice(){
        return price;
    }

    public void increaseNumSales(){
        numSales++;
    }

    
}