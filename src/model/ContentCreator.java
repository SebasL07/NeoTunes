package model;
import java.util.ArrayList;

public class ContentCreator extends Producer{

    /**
     * podcasts is the arraylists of podcasts that the content creator has created
     */
    private ArrayList<Podcast> podcasts;

    /**
     * Constructor method for the class ContentCreator
     * @param nickname String,is the nickname of the user in the platform
     * @param id String, identification of the user
     * @param date Date, vinculation date to the platform
     * @param name String, is the real name of the user
     * @param imageURL String, url of the image of the user
     */
    public ContentCreator(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date,name,imageURL);

        podcasts = new ArrayList<Podcast>();
    }

    /**
     * Method to add a podcast to the arraylist of podcasts
     * pre: podcasts must be initialized
     * @param name String, is the name of the podcast
     * @param imageURL String, url of an image that represents the podcast
     * @param duration String, is the duration of the podcast
     * @param numPlayed int, is the times the song has been played
     * @param description String, is an small description of the podcast
     * @param opCategory int, option that chooses the admin to give the podcast a category
     * @return
     */
    public String addPodcast(String name, String imageURL, String duration, int numPlayed, String description, int opCategory){
        
        String msg = "No se pudo crear el podcast";

        podcasts.add(new Podcast(name, imageURL, duration, numPlayed, description,opCategory));
        msg = "Se creo exitosamente el podcast";

        return msg;
    }

    /**
     * method to search a podcast in the arraylist of podcasts by the name
     * pre: podcasts must be initialized
     * @param name String, the name of the podcast to search 
     * @return objPodcast Podcast, null if there's not coincedence  
     */
    public Podcast searchPodcast(String name){

        Podcast objPodcast = null;
        boolean flag = false;
        
        for(int i = 0; i<podcasts.size()&&!flag;i++){
            if(podcasts.get(i).getName().equals(name)){
                objPodcast = podcasts.get(i);
                flag = true;
            }
        }

        return objPodcast;
    }

    public int totalNumPlayed(){

        int total = 0;

        for(int i = 0; i<podcasts.size();i++){
            total += podcasts.get(i).getNumPlayed();
        }

        super.setReprductions(total);

        return total;
    }
}