package model;
import java.util.ArrayList;

public class ContentCreator extends Producer{

    private ArrayList<Podcast> podcasts;

    public ContentCreator(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date,name,imageURL);

        podcasts = new ArrayList<Podcast>();
    }

    public String addPodcast(String name, String imageURL, String duration, int numPlayed, String description, int opCategory){
        
        String msg = "No se pudo crear el podcast";

        podcasts.add(new Podcast(name, imageURL, duration, numPlayed, description,opCategory));
        msg = "Se creo exitosamente el podcast";

        return msg;
    }

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
}