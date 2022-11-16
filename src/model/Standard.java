package model;

public class Standard extends Consumer implements iPlay{
    private static final int MAX_PLAYLIST = 20;
    private static final int MAX_AUDIOS = 100;
    private Playlist[] playlists;
    private Song[] songsBuyed;

    public Standard(String nickname, String id, Date date){
        super(nickname,id,date);

        playlists = new Playlist[MAX_PLAYLIST];
        songsBuyed = new Song[MAX_AUDIOS];
    }

    public int findFreeSpace(){

        int pos  = -1;
        boolean flag = false;

        for(int i = 0; i<MAX_PLAYLIST&&!flag;i++){
            if(playlists[i] == null){
                pos = i;
                flag = true;
            }
        }

        return pos;
    }
    
    public int findFreeSpaceBuyedSongs(){

        int pos  = -1;
        boolean flag = false;

        for(int i = 0; i<MAX_AUDIOS&&!flag;i++){
            if(songsBuyed[i] == null){
                pos = i;
                flag = true;
            }
        }

        return pos;
    }  

    public int findPlaylist(String name){

        int pos  = -1;
        boolean flag = false;

        for(int i = 0; i<MAX_PLAYLIST&&!flag;i++){
            if(playlists[i].getName().equals(name)){
                pos = i;
                flag = true;
            }
        }

        return pos;
    }
    
    public String createPlaylist(String name){

        String msg = "No se ha podido crear la playlist. ";

        int pos = findFreeSpace();

        if(pos != -1){

            playlists[pos] = new Playlist(name);
            msg = "Se ha creado la playlist " + name;  

        } else{

            msg += "No hay espacio para mas playlists.";
        }

        return msg;
    }

    public String addSong2Playlist(Song objSong, String name){

        String msg = "No se pudo adicionar la cancion a la playlist.";
        int pos = findPlaylist(name);

        if(pos != -1){
            playlists[pos].addSong(objSong);
            msg = "Se  ha adicionado la cancion exitosamente";
        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String addPodcast2Playlist(Podcast objPodcast, String name){

        String msg = "No se pudo adicionar el podcast a la playlist.";
        int pos = findPlaylist(name);

        if(pos != -1){
            playlists[pos].addPodcast(objPodcast);
        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String sharePlaylist(String namePlaylist){

        String msg = "";

        int pos = findPlaylist(namePlaylist);

        if(pos != -1){
            msg = playlists[pos].generSharePlaylist();
        }

        return msg;
    }

    /**
     * Method to add a buyed song 
     * @param song
     * @param money
     * @return
     */
    public String addBuyedSong(Song song, double money){
        
        String msg = "";

        int pos = findFreeSpaceBuyedSongs();
        if(pos != -1){

            if(song.getPrice() <=money){
                songsBuyed[pos] = song;
            }else{
                msg = "El dinero es insuficiente";
            }
        } else{
            msg = "No se puede comprar mas canciones";
        }
        
        return msg;
        
    } 

    @Override
    public String playSong(){

        String songPlaying = "";

        

        try {
            wait(100);
        } catch (InterruptedException e) {
            System.out.println("wut");
        }

        return songPlaying;
    }

    @Override
    public String playPodcast(){
        
        String podcastPlaying = "";


        return podcastPlaying;
    }
}