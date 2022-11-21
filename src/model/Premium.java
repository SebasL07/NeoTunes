package model;
import java.util.ArrayList;

public class Premium extends Consumer implements iPlay{
    
    private ArrayList<Playlist> playlists;
    private ArrayList<Song> songsBuyed;
    
    public Premium(String nickname, String id, Date date){

        super(nickname,id,date);

        playlists = new ArrayList<Playlist>();
        songsBuyed = new ArrayList<Song>();

    }

    public String createPlaylist(String name){

        playlists.add(new Playlist(name));

        return "Se creo la playlist exitosamenete";

    }

    public Playlist searchPlaylist(String name){

        Playlist obPlaylist = null;
        boolean flag = false;

        for(int i = 0; i<playlists.size()&&!flag;i++){
            if(playlists.get(i).getName().equals(name)){
                obPlaylist = playlists.get(i);
                flag = true;
            }
        }

        return obPlaylist;
    }

    public String addSong2Playlist(Song objSong, String name){

        String msg = "No se pudo adicionar la cancion a la playlist.";
        
        Playlist obPlaylist = searchPlaylist(name);
        int pos = 0;

        if(obPlaylist != null){
            
            pos = playlists.indexOf(obPlaylist);

            playlists.get(pos).addSong(objSong);

        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String removeSong2Playlist(Song objSong, String name){

        String msg = "No se pudo adicionar la cancion a la playlist.";
        
        Playlist obPlaylist = searchPlaylist(name);
        int pos = 0;

        if(obPlaylist != null){
            
            pos = playlists.indexOf(obPlaylist);

            playlists.get(pos).removeAudioSong(objSong);

        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String addPodcast2Playlist(Podcast podcast, String name){

        String msg = "No se pudo adicionar la cancion a la playlist.";
        
        Playlist obPlaylist = searchPlaylist(name);
        int pos = 0;
        
        if(obPlaylist != null){
            
            pos = playlists.indexOf(obPlaylist);

            playlists.get(pos).addPodcast(podcast);

        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String removePodcast2Playlist(Podcast podcast, String name){

        String msg = "No se pudo adicionar la cancion a la playlist.";
        
        Playlist obPlaylist = searchPlaylist(name);
        int pos = 0;
        
        if(obPlaylist != null){
            
            pos = playlists.indexOf(obPlaylist);

            playlists.get(pos).removeAudioPodcast(podcast);

        } else{
            msg += " La playlist no existe";
        }

        return msg;
        
    }

    public String addSongBuyed(Song song, double money){
        String msg = "";
        if(song.getPrice() <=money){
            songsBuyed.add(song);
        }else{
            msg = "El dinero es insuficiente";
        }
        return msg;
    }

    public String sharePlaylist(String namePlaylist){

        String msg = "";

        Playlist playlist = searchPlaylist(namePlaylist);

        if(playlist != null){
            msg = playlist.generSharePlaylist();
        }

        return msg;
    }

    @Override
    public String playAudio(String namePlaylist, int posArray){
        String playingAudio = "";

        Playlist playlist = searchPlaylist(namePlaylist);

        if(playlist != null){

            playingAudio = "Se esta reproduciendo " + playlist.getAudios().get(posArray).getName();
            
        }

        return playingAudio;
    }

    
}