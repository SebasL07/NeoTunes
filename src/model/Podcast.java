package model;

public class Podcast extends Audio{
    
    private String description;

    private Category category;

    public Podcast(String name, String imageURL, String duration, int numPlayed, String description, int opCategory){
        super(name, imageURL, duration, numPlayed);

        switch(opCategory){
            case 1:
                category = Category.POLITIC;
                break;

            case 2:
                category = Category.ENTERTAINMENT;
                break;
            case 3:
                category = Category.FASHION;
                break;
            case 4:
                category = Category.VIDEOGAMES;
                break;
        }

        this.description = description;
    }

    @Override
    public String toString(){
        return super.toString() + 
        "Categoria: " + category +"\n"+
        "Descripcion: " + description;
    }
}