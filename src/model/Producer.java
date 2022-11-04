package model;

public abstract class Producer extends User{

    private String name;
    private String imageURL;
    private int playedTime;

    public Producer(String nickname, String id, Date date, String name, String imageURL, int playedTime){
        super(nickname,id,date);

        this.name = name;
        this.imageURL = imageURL;
        this.playedTime = playedTime;
    }
}