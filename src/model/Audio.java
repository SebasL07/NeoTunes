package model;

public abstract class Audio{
    
    private String name;
    private String imageURL;
    private String duration;
    private int numPlayed;

    public Audio(String name, String imageURL, String duration, int numPlayed){

        this.name = name;
        this.imageURL = imageURL;
        this.duration = duration;
        this.numPlayed = numPlayed;
    }

    public String toString(){
        return "Nombre: " + name + "\n" + 
        "Imagen: " + imageURL + "\n" +
        "Duracion: " + duration + "\n" + 
        "Numero de reproducciones: " + numPlayed + "\n";
    }

    public String getName(){
        return name;
    }
}