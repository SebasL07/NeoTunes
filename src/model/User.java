package model;

public abstract class User{
    
    private String nickname;
    private String id;

    private Date vinculationDate;

    public User(String nickname, String id, Date date){
        this.nickname = nickname;
        this.id = id;
        this.vinculationDate = date;

    }

    public String getNickname(){
        return nickname;
    }

    public String getId(){
        return id;
    }

    public Date getVinculationDate(){
        return vinculationDate;
    }

    public String toString(){
        return "Nickname: " + nickname + "\n" + 
        "ID: " + id + "\n";
    }
}