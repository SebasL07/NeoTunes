package model;
import java.util.ArrayList;

public class ContentCreator extends Producer{

    private ArrayList<Podcast> podcasts;

    public ContentCreator(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date,name,imageURL);

        podcasts = new ArrayList<Podcast>();
    }

    public String addPodcast(String name, String imageURL, String duration, int numPlayed, String description){
        
        String msg = "No se pudo crear el podcast";

        podcasts.add(new Podcast(name, imageURL, duration, numPlayed, description));
        msg = "Se creo exitosamente el podcast";

        return msg;
    }
}