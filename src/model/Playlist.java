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

    
}