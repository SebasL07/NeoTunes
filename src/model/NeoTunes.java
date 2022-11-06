package model;
import java.util.ArrayList;


public class NeoTunes{
    
    private ArrayList<User> users;

    public NeoTunes(){
        users = new ArrayList<User>();
    }

    public String addConsumerStandard(String nickname, String id, int day, int month, int year){
        String msg = "No se ha podido crear el usuario.";
        
        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new Standard(nickname,id,date));
            msg = "Se creo exitosamente el usuario";
        }else {
            msg += "El usuario ya existe";
        }
        
        return msg; 
    }

    public String addConsumerPremium(String nickname, String id, int day, int month, int year){
        String msg = "No se ha podido crear el usuario.";
        
        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new Premium(nickname,id,date));
            msg = "Se creo exitosamente el usuario";
        
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

    public String addProducerArtist(String nickname, String id, int day, int month, int year, String name, String imageURL){
        String msg = "No se ha podido crear el usuario.";

        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new Artist(nickname, id, date, name, imageURL));
            msg = "Se creo exitosamente el usuario";
        
        } else {
            msg += "El usuario ya existe";
        }

        return msg;
    }

    public String addProducerContentCreator(String nickname, String id, int day, int month, int year, String name, String imageURL){
        String msg = "No se ha podido crear el usuario.";

        Date date = new Date(day, month, year);

        if(!userExist(nickname, id)){
            users.add(new ContentCreator(nickname, id, date, name, imageURL));
            msg = "Se creo exitosamente el usuario";
        
        } else {
            msg += "El usuario ya existe";
        }

        return msg;
    }

    public Artist searchArtist(String id){

        Artist objArtist = null;
        
        for(int i = 0; i<users.size();i++){
            if(users.get(i) instanceof Artist && users.get(i).getId().equals(id)){
                objArtist = (Artist) users.get(i);
            }
        }
        return objArtist;

    }

    public ContentCreator searchContentCreator(String id){

       ContentCreator objContentCreator = null;
        
        for(int i = 0; i<users.size();i++){
            if(users.get(i) instanceof ContentCreator && users.get(i).getId().equals(id)){
                objContentCreator = (ContentCreator) users.get(i);
            }
        }
        return objContentCreator;

    }

    public String addSong2Artist(String id,String name, String imageURL, String duration, int numPlayed, String album, double price, int opGender){

        String msg = "No se pudo crear la cancion.";

        Artist obArtist = searchArtist(id);

        if(obArtist != null){
            obArtist.addSong(name, imageURL, duration, numPlayed, album, price, opGender);
            msg = "Se ha creado la cancion en la aplicacion";
        }else{
            msg += " Artista no existente.";
        } 
        
        return msg;
    }

    public String addPodcast2ContentCreator(String id, String name, String imageURL, String duration, int numPlayed, String description){

        String msg = "No se pudo crear el podcast.";

        ContentCreator obContentCreator =  searchContentCreator(id);

        if(obContentCreator != null){
            obContentCreator.addPodcast(name, imageURL, duration, numPlayed, description);
            msg = "Se ha creado el podcast en la aplicacion";
        } else{
            msg += " Artista no existente.";
        }
        
        return msg;
    }

    public Standard searchStandard(String id){

        Standard objAStandard = null;
        
        for(int i = 0; i<users.size();i++){
            if(users.get(i) instanceof Standard && users.get(i).getId().equals(id)){
                objAStandard = (Standard) users.get(i);
            }
        }
        return objAStandard;

    }

    public Premium searchPremium(String id){

        Premium objPremium = null;
        
        for(int i = 0; i<users.size();i++){
            if(users.get(i) instanceof Premium && users.get(i).getId().equals(id)){
                objPremium = (Premium) users.get(i);
            }
        }
        return objPremium;

    }

    public String createPlayistStandard(String id, String name){

        String msg = "No se ha podido crear la playlist.";

        Standard obStandard = searchStandard(id);

        if(obStandard != null){
            
            msg = obStandard.createPlaylist(name);
          
        } else{
            msg += "El artista no existe";
        }
        

        return msg;
    }

    public String createPlayistPremium(String id, String name){

        String msg = "No se ha podido crear la playlist.";

        Premium obPremium = searchPremium(id);

        if(obPremium != null){
            
            obPremium.createPlaylist(name);
            msg = "Se ha creado la playlist exitosamente";
          
        } else{
            msg += "El creador no existe";
        }
        

        return msg;
    }




    
    
}