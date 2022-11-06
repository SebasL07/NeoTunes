package model;
import java.util.ArrayList;;

public class Artist extends Producer{
    
    private ArrayList<Song> songs;

    public Artist(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date,name,imageURL);

        songs = new ArrayList<Song>();
    }

    public String addSong(String name, String imageURL, String duration, int numPlayed, String album, double price, int opGender){
        String msg = "No se pudo crear la cancion";

        songs.add(new Song(name, imageURL, duration, numPlayed, album, price, opGender));
        msg = "Se creo exitosamente el la cancion";

        return msg;
    }
}