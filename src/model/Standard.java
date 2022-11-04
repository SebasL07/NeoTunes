package model;

public class Standard extends Consumer{
    private static final int MAX_PLAYLIST = 20;
    private Playlist[] playlists;

    public Standard(String nickname, String id, Date date){
        super(nickname,id,date);

        playlists = new Playlist[MAX_PLAYLIST];
    }
}