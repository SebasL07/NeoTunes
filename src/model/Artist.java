package model;
import java.util.ArrayList;;

public class Artist extends Producer{
    
    private ArrayList<Song> songs;

    public Artist(String nickname, String id, Date date, String name, String imageURL, int playedTime){
        super(nickname,id,date,name,imageURL,playedTime);

        songs = new ArrayList<Song>();
    }
}