package model;
import java.util.ArrayList;

public class Playlist{


    private ArrayList<Audio> audios; 

    private String name;
    private String id;

    public Playlist(String name){
        this.name = name;

        audios = new ArrayList<Audio>();
    }

    public int countSongs(){
        int countSong = 0;
        for(int i = 0; i < audios.size(); i++){
            if(audios.get(i) instanceof Song){
                countSong++;
            }
        }

        return countSong;
    }
    
    public int countPodcasts(){
        int countPodcast = 0;
        for(int i = 0; i < audios.size(); i++){
            if(audios.get(i) instanceof Podcast){
                countPodcast++;
            }
        }

        return countPodcast;
    }

    


}