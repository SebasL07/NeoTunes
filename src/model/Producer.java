package model;

public abstract class Producer extends User{

    private String name;
    private String imageURL;
    private int playedTime;
    private int reproductions;

    public Producer(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date);

        this.name = name;
        this.imageURL = imageURL;
        playedTime = 0;
        reproductions = 0;
    }

    public String getName(){
        return name;
    }

    public String getImageURL(){
        return imageURL;
    }

    public int getPlayedTime(){
        return playedTime;
    }

    public int getReproductions(){
        return reproductions;
    }

    @Override
    public String toString(){
        return super.toString() + 
        "Nombre real: " + name + "\n" + 
        "Imagen: " + imageURL + "\n" + 
        "Tiempo total de reproduccion: " + playedTime + "\n" + 
        "Numero de reproducciones: " + reproductions + "\n"; 
    }
}