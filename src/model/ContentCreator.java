package model;
import java.util.ArrayList;

public class ContentCreator extends Producer{

    private ArrayList<Podcast> podcasts;

    public ContentCreator(String nickname, String id, Date date, String name, String imageURL, int playedTime){
        super(nickname,id,date,name,imageURL,playedTime);

        podcasts = new ArrayList<Podcast>();
    }
}