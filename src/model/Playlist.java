package model;
import java.util.ArrayList;



public class Playlist{

    /**
     * MAX_CODE size of the matrix id
     */
    private static final int MAX_CODE = 6;
    /**
     * audios is the arraylist of audios 
     */
    private ArrayList<Audio> audios; 

    /**
     * name is the name of the playlist 
     */
    private String name;
    /**
     * id is the matrix that conatians the code that represents the playlist
     * when is going to be shared
     */
    private int[][] id;

    /**
     * constructor method of the class Playlist
     * @param name String, name of the playlist
     */
    public Playlist(String name){
        this.name = name;

        id = new int[MAX_CODE][MAX_CODE];

        audios = new ArrayList<Audio>();
    }

    /**
     * method to count the songs in the playlsit
     * @return countSong int, the quantity of songs in the playlist
     */
    public int countSongs(){
        int countSong = 0;
        for(int i = 0; i < audios.size(); i++){
            if(audios.get(i) instanceof Song){
                countSong++;
            }
        }

        return countSong;
    }

    /**
     * method to add a Song to the array
     * @param song Song
     */
    public void addSong(Song song){
        audios.add(song);
    }
    /**
     * method to add Podcast to the array
     * @param podcast Podcast
     */
    public void addPodcast(Podcast podcast){
        audios.add(podcast);
    }
    /**
     * method to count the quantity of podcasts in the array
     * @return countPodcasts int, the total of podcasts in the array
     */
    public int countPodcasts(){
        int countPodcast = 0;
        for(int i = 0; i < audios.size(); i++){
            if(audios.get(i) instanceof Podcast){
                countPodcast++;
            }
        }

        return countPodcast;
    }
    /**
     * method to get the name of the playlist
     * @return name String
     */
    public String getName(){
        return name;
    }
    /**
     * Method to show the matrix id
     * @return msg String 
     */
    public String showID(){

        String msg = "";

        for(int i = 0;i<id.length;i++){
            msg += "[";
            for(int j = 0; j<id[0].length;j++){
                msg += id[i][j];
            }
            msg += "] \n";
        }

        return msg;
    }
    /**
     * method to generate the code to share the playlist
     * @return the code for share the playlist
     */
    public String generSharePlaylist(){

        
        for(int i = 0; i<MAX_CODE;i++){
            for(int j= 0; j<id[0].length;j++){
                id[i][j] = (int) (Math.random() * 9);
            }
        }

        String shareId = "Matriz del codigo:\n\n" + showID()
        + "\n\n Codigo: ";

        int songsInPlaylist = countSongs();
        int podcastInPlaylist = countPodcasts();

        if(songsInPlaylist == 0 && podcastInPlaylist != 0){
            
            for(int j = 0; j<(id.length/2);j++){
                shareId += id[0][j];
            }

            for(int i = 1; i<id.length;i++){
                shareId += id[i][(id.length/2)-1];
            }

            for(int i = id.length-1;i>0;i--){
                shareId += id[i][id.length/2];
            }

            for(int j = id.length/2;j<id.length;j++){
                shareId += id[0][j];
            }

        } else if(songsInPlaylist != 0 && podcastInPlaylist == 0){

            for(int i = id.length-1;i>=0;i--){
                shareId += id[i][0];
            }

            for(int i = 1; i<id.length;i++){
                shareId += id[i][i];
            }

            for(int i = id.length-2;i>=0;i--){
                shareId += id[i][id.length-1];
            }

        } else if(songsInPlaylist != 0 && podcastInPlaylist != 0){

            for(int i = id.length - 1;i>=0;i-- ){
                for(int j = id.length-1;j>=0;j--){
                    if((i+j)%2 != 0 && (i+j) > 1){
                        shareId += id[i][j];
                    }
                }
            }
        }

        


        return shareId;

    }
    /**
     * method to get the arraylist of audios
     * @return audios ArrayList<Audio>
     */
    public ArrayList<Audio> getAudios(){
        return audios;
    }

    public void removeAudioSong(Song song){
        audios.remove(song);
    }

    public void removeAudioPodcast(Podcast podcast){
        audios.remove(podcast);
    }

    


}