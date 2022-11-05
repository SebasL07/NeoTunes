package model;
import java.util.ArrayList;

public class NeoTunes{
    
    private ArrayList<User> users;

    public NeoTunes(){
        users = new ArrayList<User>();
    }

    public String addConsumerStandard(String nickname, String id, int day, int month, int year){
        String msg = "";
        
        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new Standard(nickname,id,date));
        }
        
        return msg; 
    }

    public String addConsumerPremium(String nickname, String id, int day, int month, int year){
        String msg = "No se ha podido crear el usuario.";
        
        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new Premium(nickname,id,date));
        
        } else {
            msg += "El usuario ya existe";
        }
        
        return msg; 
    }

    public boolean userExist(String nickname, String id){

        boolean exist = false;
        if(users.isEmpty()){
            for(int i = 0; i<users.size()&&!exist;i++){
                if(users.get(i).getNickname().equals(nickname) && users.get(i).getId().equals(id)){
                    exist = true;
                }
            } 
        }
        

        return exist;
    }

    
}