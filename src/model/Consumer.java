package model;

public abstract class Consumer extends User{
    
    private int playingTimeSong;
    private int playingTimePodcast;
    private String mostListenedGender;
    private String mostListenedCategory;
    private String mostListenedArtist;
    private String mostListenedContentCreator;

    public Consumer(String nickname, String id, Date date){
        super(nickname,id,date);

        playingTimeSong = 0;
        playingTimePodcast = 0;
        mostListenedGender = "";
        mostListenedCategory = "";
        mostListenedArtist = "";
        mostListenedContentCreator = "";
    }

    
    
}