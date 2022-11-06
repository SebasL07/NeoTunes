package model;

public class Standard extends Consumer{
    private static final int MAX_PLAYLIST = 20;
    private Playlist[] playlists;

    public Standard(String nickname, String id, Date date){
        super(nickname,id,date);

        playlists = new Playlist[MAX_PLAYLIST];
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
    
    public String createPlaylist(String name){

        String msg = "No se ha podido crear la playlist";

        int pos = findFreeSpace();

        if(pos == -1){

            playlists[pos] = new Playlist(name);
            msg = "Se ha creado la playlist " + name;  
        } else{
            msg += "No hay espacio para mas playlists";
        }

        return msg;
    }
}