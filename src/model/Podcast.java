package model;

public class Podcast extends Audio{
    
    private String description;

    private Category category;

    public Podcast(String name, String imageURL, String duration, int numPlayed, String description){
        super(name, imageURL, duration, numPlayed);

        this.description = description;
    }

    @Override
    public String toString(){
        return super.toString() + 
        "Categoria: " + category +"\n"+
        "Descripcion: " + description;
    }
}