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
     * numPlayed represents the times that the song has been played in the platform
     */
    private int numPlayed;

    /**
     * Constructor method from the class Audio
     * @param name String, is the name of teh audio
     * @param imageURL String, is the URL of the album if song or a representative image if podcast
     * @param duration String, duration represents the suration of the song
     * @param numPlayed int, represents the times that the song has been played in the platform
     */
    public Audio(String name, String imageURL, String duration, int numPlayed){

        this.name = name;
        this.imageURL = imageURL;
        this.duration = duration;
        this.numPlayed = numPlayed;
    }

    /**
     * method toString, converts the information into String to be show
     * @return String with the information of the class
     */
    public String toString(){
        return "Nombre: " + name + "\n" + 
        "Imagen: " + imageURL + "\n" +
        "Duracion: " + duration + "\n" + 
        "Numero de reproducciones: " + numPlayed + "\n";
    }

    /**
     * method to get the name of the audio
     * @return name String
     */
    public String getName(){
        return name;
    }
}