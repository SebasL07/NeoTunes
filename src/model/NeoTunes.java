package model;
import java.util.ArrayList;





public class NeoTunes{
    
    private ArrayList<User> users;
    private ArrayList<Sale> sales;

    public NeoTunes(){
        users = new ArrayList<User>();
        sales = new ArrayList<Sale>();
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

    public String addPodcast2ContentCreator(String id, String name, String imageURL, String duration, int numPlayed, String description, int opCategory){

        String msg = "No se pudo crear el podcast.";

        ContentCreator obContentCreator =  searchContentCreator(id);

        if(obContentCreator != null){
            obContentCreator.addPodcast(name, imageURL, duration, numPlayed, description,opCategory);
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

    public String addSong2PlaylistStandard(String idStandard, String nameSong, String idArtist, String namePlaylist){

        String msg = "No se pudo adicionar la cancion.";

        Artist objArtist = searchArtist(idArtist);

        Standard objStandard = searchStandard(idStandard);

        if(objArtist != null && objStandard != null){
            Song song = objArtist.searchSong(nameSong);

            if(song != null){
                msg = objStandard.addSong2Playlist(song, namePlaylist);
            } else{
                msg += " No existe " + nameSong + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String addSong2PlaylistPremium(String idPremium, String nameSong, String idArtist, String namePlaylist){

        String msg = "No se pudo adicionar la cancion.";

        Artist objArtist = searchArtist(idArtist);

        Premium objPremium = searchPremium(idPremium);

        if(objArtist != null && objPremium != null){
            Song song = objArtist.searchSong(nameSong);

            if(song != null){
                msg = objPremium.addSong2Playlist(song, namePlaylist);
            } else{
                msg += " No existe " + nameSong + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String addPodcast2PlaylistStandard(String idStandard, String namePodcast, String idContentCreator, String namePlaylist){

        String msg = "No se pudo adicionar la cancion.";

        ContentCreator objCreator = searchContentCreator(idContentCreator);

        Standard objStandard = searchStandard(idStandard);

        if(objCreator != null && objStandard != null){
            Podcast podcast = objCreator.searchPodcast(namePodcast);

            if(podcast != null){
                msg = objStandard.addPodcast2Playlist(podcast, namePlaylist);
            } else{
                msg += " No existe " + namePodcast + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String addPodcast2PlaylistPremium(String idPremium, String namePodcast, String idContentCreator, String namePlaylist){

        String msg = "No se pudo adicionar la cancion.";

        ContentCreator objCreator = searchContentCreator(idContentCreator);

        Premium premium = searchPremium(idPremium);

        if(objCreator != null && premium != null){
            
            Podcast podcast = objCreator.searchPodcast(namePodcast);

            if(podcast != null){
                msg = premium.addPodcast2Playlist(podcast, namePlaylist);
            } else{
                msg += " No existe " + namePodcast + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String sharePlaylistStandard(String idStandard, String namePlaylist){

        String idShare = "";

        Standard obStandard = searchStandard(idStandard);

        if(obStandard != null){

            idShare  = obStandard.sharePlaylist(namePlaylist);
        }

        return idShare;
    }

    public String sharePlaylistPremium(String idPremium, String namePlaylist){

        String idShare = "";

        Premium obPremium = searchPremium(idShare);

        if(obPremium != null){

            idShare  = obPremium.sharePlaylist(namePlaylist);
        }

        return idShare;
    }

    /**
     * Method for buy a song for a premium user consumer(wip) --Falta añadir el objeto compra dentro de la controladora
     * @param idPremium
     * @param idArtist
     * @param nameSong
     * @param moneyReceived
     * @return confirmation msg
     */
    public String buyASongPremium(String idPremium, String idArtist, String nameSong, double moneyReceived){
        
        String msg = "No se pudo realizar la transaccion. ";

        Premium obPremium = searchPremium(idPremium);

        Artist obArtist = searchArtist(idArtist);



        if(obPremium != null && obArtist != null){
            
            Song song = obArtist.searchSong(nameSong);

            if(song != null){

                msg += obPremium.addSongBuyed(song, moneyReceived); 
                sales.add(new Sale(obPremium.getNickname(), song));

                song.increaseNumPlayed();

                msg = "Se realizo la compra correctamente";

            } else{
                msg += " No existe " + nameSong + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String buyASongStandard(String idStandard, String idArtist, String nameSong, double moneyReceived){
        
        String msg = "No se pudo realizar la transaccion. ";

        Standard obStandard = searchStandard(idStandard);

        Artist obArtist = searchArtist(idArtist);

        if(obStandard != null && obArtist != null){
            
            Song song = obArtist.searchSong(nameSong);

            if(song != null){

                msg += obStandard.addBuyedSong(song, moneyReceived); 
                sales.add(new Sale(obStandard.getNickname(), song));

                song.increaseNumPlayed();
                
                msg = "Se realizo la compra correctamente";

            } else{
                msg += " No existe " + nameSong + " en la plataforma"; 
            }

        } else{
            msg += " Alguno de los usuarios ingresados no existen en la plataforma";
        }

        return msg;
    }

    public String showPriceSong(String idArt, String nameSong){
        String msg = "No existe el artista.";

        Artist obArtist = searchArtist(idArt);

        if(obArtist != null){

            Song song = obArtist.searchSong(nameSong);

            if(song != null){
                msg = "Precio de la cancion: " + song.getPrice();
            } else{
                msg = "La cancion no existe";
            }
        }

        return msg;


    }

    public String playAudioStandard(String idStandard, String namePlay, int posArray){

        String playing = "";

        Standard standard = searchStandard(idStandard);

        if(standard != null){

            playing = standard.playAudio(namePlay, posArray);

        } else{

            playing = "No existe el usuario en la plataforma";
        }

        
        return playing;
    }

    public String playAudioPremium(String idPremium, String namePlay, int posArray){

        String playing = "";

        Premium premium = searchPremium(idPremium);

        if(premium != null){

            playing = premium.playAudio(namePlay, posArray);

        } else{

            playing = "No existe el usuario en la plataforma";
        }

        
        return playing;
    }

    /**
     * Method to count the total of times that each kind of audio has been played
     * @return msg with the information
     */
    public String showInformationNumPlayedAudios(){

        String msg = "";

        int numPlayedSong = 0;
        int numPlayedPodcast = 0;

        for(int i = 0;i<users.size();i++){

            if(users.get(i) instanceof Artist){
               Artist artist = (Artist) users.get(i);

               numPlayedSong += artist.totalNumPlayed();
            } else if(users.get(i) instanceof ContentCreator){
                ContentCreator creator = (ContentCreator) users.get(i);

                numPlayedPodcast += creator.totalNumPlayed();  
            }
        }

        msg = "Total de reproducciones de canciones: " + numPlayedSong + "\n"+
        "Total de reproducciones de podcast: " + numPlayedPodcast + "\n";

        return msg;
    }

    public String findMostSaledSong(){

		String msg = "";

        int higherSales = sales.get(0).getBuyedSong().getNumSales();
        int pos = 0;

		for(int i = 0; i<sales.size();i++){
            
            if(higherSales < sales.get(i).getBuyedSong().getNumSales()){
                higherSales = sales.get(i).getBuyedSong().getNumSales();
                pos = i;
            }

		}

        msg = sales.get(pos).getBuyedSong().toString();

        

		return msg;
	}
    




    
    
}