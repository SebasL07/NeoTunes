package model;

public abstract class Audio{
    /**
     * name is the name of the audio
     */
    private String name;
    /**
     * imageURL is the URL of the album if song or a representative image if podcast
    */
    private String imageURL;
    /**
     * duration represents the suration of the song
     */
    private String duration;
    /**
     * 
     */
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