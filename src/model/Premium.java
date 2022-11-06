package model;
import java.util.ArrayList;

public class Premium extends Consumer{
    
    private ArrayList<Playlist> playlists;
    
    public Premium(String nickname, String id, Date date){

        super(nickname,id,date);

        playlists = new ArrayList<Playlist>();

    }

    public String createPlaylist(String name){

        playlists.add(new Playlist(name));

        return "Se creo la playlist exitosamenete";

    }

    
}