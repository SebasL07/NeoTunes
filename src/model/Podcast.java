package model;

public class Podcast extends Audio{
    
    /**
     * description is a small description of the podcast
     */
    private String description;

    /**
     * category is the category where it belongs the podcast
     */
    private Category category;

    /**
     * constructor method for the class Podcast
     * @param name String, is teh name of the pdocast 
     * @param imageURL String, is the url of a representative image of the pdocast 
     * @param duration String, is the duration of the podcast
     * @param numPlayed int, is the times the podcast has been played
     * @param description String, small description of teh podcast
     * @param opCategory int, option to choose teh coategory of teh podcast 
     */
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

    /**
     * method toStrring to show the information of the podcast
     * @return msg with the information of the podcast
     */
    @Override
    public String toString(){
        return super.toString() + 
        "Categoria: " + category +"\n"+
        "Descripcion: " + description;
    }
}