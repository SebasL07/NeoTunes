package model;
import java.util.ArrayList;;

public class Artist extends Producer{

    /**
     * songs is the arraylist of songs that the artsit has 
     */
    private ArrayList<Song> songs;

    /**
     * Constructor method from the class Artist
     * @param nickname String, is the nickname how is knwon this user in the platform
     * @param id String, is the identificationof the user in the platform
     * @param date Date, is the date that the user vinculated in the platform
     * @param name String, is the real name of the user
     * @param imageURL String, representative image of the artist
     */
    public Artist(String nickname, String id, Date date, String name, String imageURL){
        super(nickname,id,date,name,imageURL);

        songs = new ArrayList<Song>();
    }

    /**
     * Method to add a song in the arraylist songs
     * @param name String, name of the song
     * @param imageURL String, image of the album where belongs the song
     * @param duration String, is the duration of the song
     * @param numPlayed int, represent the times that the song has been played
     * @param album String, name of the album where belongs the song
     * @param price double, sale price of one unit of the song
     * @param opGender
     * @return
     */
    public String addSong(String name, String imageURL, String duration, int numPlayed, String album, double price, int opGender){
        String msg = "No se pudo crear la cancion";

        songs.add(new Song(name, imageURL, duration, numPlayed, album, price, opGender));
        msg = "Se creo exitosamente el la cancion";

        return msg;
    }

    /**
     * Method to search a song in the array songs by the name
     * pre: songs must be initialized
     * @param name String, name in the song 
     * @return song Song, object song that matchs the name
     */
    public Song searchSong(String name){
    

        Song objSong = null;
        boolean flag = false;
        
        for(int i = 0; i<songs.size()&&!flag;i++){
            if(songs.get(i).getName().equals(name)){
                objSong = songs.get(i);
                flag = true;
            }
        }

        return objSong;
    }

    public int totalNumPlayed(){

        int total = 0;

        for(int i = 0; i<songs.size();i++){
            total += songs.get(i).getNumPlayed();
        }

        super.setReprductions(total);
        
        return total;
    }
}