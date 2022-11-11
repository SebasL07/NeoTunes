package model;
import java.util.ArrayList;



public class Playlist{

    private static final int MAX_CODE = 6;
    private ArrayList<Audio> audios; 

    private String name;
    private int[][] id;

    public Playlist(String name){
        this.name = name;

        id = new int[MAX_CODE][MAX_CODE];

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

    public void addSong(Song song){
        audios.add(song);
    }
    
    public void addPodcast(Podcast podcast){
        audios.add(podcast);
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

    public String getName(){
        return name;
    }

    public String generSharePlaylist(){

        for(int i = 0; i<MAX_CODE;i++){
            for(int j= 0; j<id[0].length;j++){
                id[i][j] = (int) (Math.random() * 9);
            }
        }

        String shareId = "";



        return shareId;

    }

    


}