package ui;
import java.util.Scanner;
import model.NeoTunes;

//javac -cp src src/ui/Template.java -d bin
//java -cp bin ui.Template

public class NeoTunesMain{
	
	Scanner reader;
	NeoTunes objTunes;

	public NeoTunesMain(){
		reader = new Scanner(System.in);
		objTunes = new NeoTunes();
	}
	
	public static void main(String[] a){
		
		System.out.println("Bienvenido/a a la aplicacion NeoTunes. \n Inicializando la app...\n");

		NeoTunesMain objMain = new NeoTunesMain();

		int option = 0;

		do {
			option = objMain.Menu();
			objMain.executeOp(option);
		} while (option != 0);


	}

	public int Menu(){

		System.out.println("\nQue opcion del menu desea realizar? \n" + 
		" 1) Registrar usuario consumidor \n" + 
		" 2) Registrar usuario productor\n" +
		" 3) Registrar tipo de audio\n" + 
		" 4) Crear playlist\n" +
		" 5) Modificar playlist\n" +
		" 6) Compartir Playlist\n" +
		" 7) Reproducir audio\n" +
		" 8) Comprar cancion\n" +
		" 9) Informes de la plataforma\n" +
		" 0) Salir de la app\n");
		int option = reader.nextInt();
		reader.nextLine();
		return option;
	}

	public void executeOp(int op){

		switch(op){

			case 1: 
				addConsumer();
				break;

			case 2:
				addProducer();
				break;
			case 3: 
				addAudio();
				break;

			case 4: 
				createPlaylist();
				break;
			
			case 5: 
				modifyPlaylist();
				break;

			case 6:
				sharePlaylist();
				break;

			case 7:
				playPlaylist();
				break;

			case 8:
				buyASong();
				break;

			case 9:
				showRequestedInfo();
				break;
				
			case 0:
				System.out.println("Que tenga buen dia. Gracias por usar la app");
		}
	}

	public void addConsumer(){

		System.out.println("Que tipo de usuario consumidor desea adicionar? \n" + 
		"1) Estandar\n" + 
		"2) Premium\n");

		int option = reader.nextInt();
		reader.nextLine();
		switch(option){

			case 1:
				addConsumerStandard();
				break;
			case 2:
				addConsumerPremium();
				break;
		}

	}

	public void addProducer(){

		System.out.println("Que tipo de usuario productor desea adicionar? \n" + 
		"1) Artista\n" + 
		"2) Creador de contenido\n");

		int option = reader.nextInt();
		reader.nextLine();
		switch(option){

			case 1:
				addProducerArtist();
				break;
			case 2:
				addProducerContentCreator();
				break;
		}

	}

	public void addConsumerStandard(){

		System.out.println("Ingrese el nickname del usuario");
		String nickname = reader.next();

		System.out.println("Ingrese la cedula del usaurio");
		String id = reader.next();

		System.out.println("Ingrese que dia de hoy (Solo numero)");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();
		reader.nextLine();
		System.out.println(objTunes.addConsumerStandard(nickname, id, day, month, year)); 
	}

	public void addConsumerPremium(){

		System.out.println("Ingrese el nickname del usuario");
		String nickname = reader.next();

		System.out.println("Ingrese la cedula del usaurio");
		String id = reader.next();

		System.out.println("Ingrese que dia de hoy (Solo numero)");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();
		reader.nextLine();
		System.out.println(objTunes.addConsumerPremium(nickname, id, day, month, year)); 
	}

	public void addProducerArtist(){

		System.out.println("Ingrese el nickname del usuario");
		String nickname = reader.next();

		System.out.println("Ingrese la cedula del usaurio");
		String id = reader.next();

		System.out.println("Ingrese que dia de hoy (Solo numero)");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el nombre real del artista");
		String name = reader.next();

		System.out.println("Ingrese el url de la imagen que representa el artista");
		String imageURL = reader.next();

		System.out.println(objTunes.addProducerArtist(nickname, id, day, month, year, name, imageURL)); 

		
	}

	public void addProducerContentCreator(){

		System.out.println("Ingrese el nickname del usuario");
		String nickname = reader.next();

		System.out.println("Ingrese la cedula del usaurio");
		String id = reader.next();

		System.out.println("Ingrese que dia de hoy (Solo numero)");
		int day = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el nombre real del artista");
		String name = reader.next();

		System.out.println("Ingrese el url de la imagen que representa el artista");
		String imageURL = reader.next();

		System.out.println(objTunes.addProducerContentCreator(nickname, id, day, month, year, name, imageURL)); 

		
	}

	public void addAudio(){
		System.out.println("Que tipo de audio desea adicionar?\n" + 
		" 1) Cancion\n" + 
		" 2) Podcast\n");
		int option = reader.nextInt();
		reader.nextLine();
		switch(option){

			case 1:
				addSong();
				break;

			case 2: 
				addPodcast();
				break;
		}
	}

	public void addSong(){

		System.out.println("Ingrese la cedula del artista al que le pertence la cancion");
		String id = reader.next();

		System.out.println("Ingrese el nombre de la cancion");
		String name = reader.next();

		System.out.println("Ingrese el url de una imagen del album a la que pertence la cancion");
		String imageURL = reader.next();

		System.out.println("Ingrese la duracion de la cancion. En el formato HH:MM:SS");
		String duration = reader.next();

		System.out.println("Ingrese el numero de reproducciones de la cancion");
		int numPlayed = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el album al que pertence la cancion");
		String album = reader.next();

		System.out.println("Ingrese que genero es la cancion: \n" + 
		" 1) House\n" + 
		" 2) Pop\n" + 
		" 3) Rock\n" + 
		" 4) Trap\n");
		int opGender = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el precio de la cancion");
		double price = reader.nextDouble();
		reader.nextLine();
		System.out.println(objTunes.addSong2Artist(id, name, imageURL, duration, numPlayed, album, price,opGender));
	}

	public void addPodcast(){
		System.out.println("Ingrese la cedula del creador de contenido al que le pertenece el podcast");
		String id = reader.next();

		System.out.println("Ingrese el nombre del podcast");
		String name = reader.next();

		System.out.println("Ingrese el url de una imagen que represente el podcast");
		String imageURL = reader.next();

		System.out.println("Ingrese la duracion del podcast. En el formato HH:MM:SS");
		String duration = reader.next();

		System.out.println("Ingrese el numero de reproducciones del podcast que tiene hasta ahora");
		int numPlayed = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese una breve descripcion del podcast");
		String description = reader.next();

		System.out.println("Escoja la categoria del podcast: \n"+
		"1) Politica\n" + 
		"2) Entretenimiento\n " + 
		"3) Fashion\n"+ 
		"4) Videojuegos\n");
		int opCategory = reader.nextInt();
		reader.nextLine();
		System.out.println(objTunes.addPodcast2ContentCreator(id, name, imageURL, duration, numPlayed, description, opCategory));
	}

	public void createPlaylist(){

		System.out.println("De que tipo de usuario quiere crear la playlist\n" + 
		" 1) Estandar\n" + 
		" 2) Premium\n");	

		int op = reader.nextInt();
		reader.nextLine();
		switch (op) {
			case 1:

				createPlayistStandard();
				
				break;
			case 2:

				createPlayistPremium();
				break;

			default:
				break;
		}
	}

	public void createPlayistStandard(){

		System.out.println("Ingrese el id del usaurio en el que desea crear la playlist");
		String id  = reader.next();

		System.out.println("Ingrese el nombre de la playlist");
		String name = reader.next();

		System.out.println(objTunes.createPlayistStandard(id, name));
	}

	public void createPlayistPremium(){

		System.out.println("Ingrese el id del usaurio en el que desea crear la playlist");
		String id  = reader.next();

		System.out.println("Ingrese el nombre de la playlist");
		String name = reader.next();

		System.out.println(objTunes.createPlayistPremium(id, name));
	}

	public void modifyPlaylist(){
		System.out.println("Que desea hacer con la playlist?\n" +
		" 1) Adcionar audio\n" + 
		" 2) Borrar audio\n");
		int op = reader.nextInt();
		reader.nextLine();
		switch(op){

			case 1: 
				addAudio2Playlist();
				break;

			case 2: 
				removeAudio2Playlist();
				break;
		}
	}

	public void addAudio2Playlist(){
		System.out.println("Que tipo de audio adicionara?\n" +
		" 1) Cancion\n" + 
		" 2) Podcast\n");
		int op = reader.nextInt();
		reader.nextLine();
		switch(op){

			case 1: 
				addSong2Playlist();
				break;

			case 2:
			 	addPodcast2Playlist();
				break;

		}
	}

	public void removeAudio2Playlist(){
		System.out.println("Que tipo de audio adicionara?\n" +
		" 1) Cancion\n" + 
		" 2) Podcast\n");
		int op = reader.nextInt();
		reader.nextLine();
		switch(op){

			case 1: 
				removeSong2Playlist();
				break;

			case 2:
			 	removePodcast2Playlist();
				break;

		}
	}

	public void addSong2Playlist(){

		System.out.println("A que tipo de usaurio adicionara la cancion: \n" +
		" 1) Estandar\n" + 
		" 2) Premium\n");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario al que le pertence la playlist");
		String id = reader.next();

		System.out.println("Ingrese el id del artista al que pertence la cancion");
		String idArtist = reader.next();

		System.out.println("Ingrese el nombre de la cancion");
		String nameSong = reader.next();

		System.out.println("Ingrese el nombre de la playlist a la que quiere adicionar la cancion");
		String namePlaylist = reader.next();

		switch(op){

			case 1: 
				System.out.println(objTunes.addSong2PlaylistStandard(id, nameSong, idArtist, namePlaylist));
				break;

			case 2:
				System.out.println(objTunes.addSong2PlaylistPremium(id, nameSong, idArtist, namePlaylist)); 
				break;

		}
	}

	public void removeSong2Playlist(){

		System.out.println("A que tipo de usaurio borrara la cancion: \n" +
		" 1) Estandar\n" + 
		" 2) Premium\n");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario al que le pertence la playlist");
		String id = reader.next();

		System.out.println("Ingrese el id del artista al que pertence la cancion");
		String idArtist = reader.next();

		System.out.println("Ingrese el nombre de la cancion");
		String nameSong = reader.next();

		System.out.println("Ingrese el nombre de la playlist a la que quiere borrar la cancion");
		String namePlaylist = reader.next();

		switch(op){

			case 1: 
				System.out.println(objTunes.removeSong2PlaylistStandard(id, nameSong, idArtist, namePlaylist));
				break;

			case 2:
				System.out.println(objTunes.removeSong2PlaylistPremium(id, nameSong, idArtist, namePlaylist)); 
				break;

		}
	}

	public void addPodcast2Playlist(){

		System.out.println("A que tipo de usaurio adicionara la cancion: \n" +
		" 1) Estandar\n" + 
		" 2) Premium\n");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario al que le pertence la playlist");
		String id = reader.next();

		System.out.println("Ingrese el id del creador de contenido");
		String idContentCreator = reader.next();

		System.out.println("Ingrese el nombre del podcast");
		String namePodcast = reader.next();

		System.out.println("Ingrese el nombre de la playlist a la que quiere adicionar la cancion");
		String namePlaylist = reader.next();

		switch (op) {
			case 1:
				System.out.println(objTunes.addPodcast2PlaylistStandard(id, namePodcast, idContentCreator, namePlaylist));
				break;
			
			case 2:
				System.out.println(objTunes.addPodcast2PlaylistPremium(id, namePodcast, idContentCreator, namePlaylist));
				break;
			default:
				break;
		}
	}

	public void removePodcast2Playlist(){

		System.out.println("A que tipo de usaurio borrara la cancion: \n" +
		" 1) Estandar\n" + 
		" 2) Premium\n");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario al que le pertence la playlist");
		String id = reader.next();

		System.out.println("Ingrese el id del creador de contenido");
		String idContentCreator = reader.next();

		System.out.println("Ingrese el nombre del podcast");
		String namePodcast = reader.next();

		System.out.println("Ingrese el nombre de la playlist a la que quiere borrar la cancion");
		String namePlaylist = reader.next();

		switch (op) {
			case 1:
				System.out.println(objTunes.removePodcast2PlaylistStandard(id, namePodcast, idContentCreator, namePlaylist));
				break;
			
			case 2:
				System.out.println(objTunes.removePodcast2PlaylistPremium(id, namePodcast, idContentCreator, namePlaylist));
				break;
			default:
				break;
		}
	}

	public void sharePlaylist(){

		System.out.println("De que tipo de usuario quiere compartir la playlist?\n 1) Estandar \n 2) Premium");
		int op  = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario que desea compartir la playlist");
		String idStandard = reader.next();
		
		System.out.println("Ingrese el nombre de la plalist que desea compartir");
		String namePlaylist = reader.next();

		switch(op){

			case 1: 
				 System.out.println(objTunes.sharePlaylistStandard(idStandard, namePlaylist));
				break;
			case 2: 
				System.out.println(objTunes.sharePlaylistPremium(idStandard, namePlaylist));
				break;
		}
	}

	public void buyASong(){

		System.out.println("El usuario que desea comprar es: \n 1) Estandar \n 2) Premium");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario que desea comprar");
		String idUser = reader.next();

		System.out.println("Ingrese el id del artista al que le pertenece la cancion");
		String idArtist = reader.next();

		System.out.println("Ingrese el nombre de la cancion");
		String nameSong = reader.next();

		System.out.println(objTunes.showPriceSong(idArtist, nameSong));

		System.out.println("Ingrese el dinero que va a ingresar");
		double price = reader.nextDouble();
		reader.nextLine();
		switch(op){

			case 1:
				System.out.println(objTunes.buyASongStandard(idUser, idArtist, nameSong, price));
				break;
			case 2: 
				System.out.println(objTunes.buyASongPremium(idUser, idArtist, nameSong, price));
				break;

		}
	}

	public void playPlaylist(){

		System.out.println("De que tipo de usuario quiere reproducir musica?\n 1) Estandar \n 2) Premium");
		int op = reader.nextInt();
		reader.nextLine();
		System.out.println("Ingrese el id del usuario");
		String id = reader.next();

		System.out.println("Ingrese el nombre de la playlist que quiere reproducir");
		String namePlaylist = reader.next();

		int counter = 0;
		int opContinue = 0;
		switch(op){

			case 1:
				do{

					System.out.println(objTunes.playAudioStandard(id, namePlaylist,counter));
					counter++;

					try {
						Thread.sleep(18000);
					} catch (Exception e) {
						System.out.println("Something went wrong...");
					}
					System.out.println("Desea reproducie el siguiente audio?");
					opContinue = reader.nextInt();

				}while(opContinue != 0);
				break;

			case 2: 
				do{

					System.out.println(objTunes.playAudioPremium(id, namePlaylist,counter));
					counter++;

					try {
						Thread.sleep(18000);
					} catch (Exception e) {
						System.out.println("Something went wrong...");
					}
					System.out.println("Desea reproducie el siguiente audio?");
					opContinue = reader.nextInt();

				}while(opContinue != 0);
				break;
		}
	}

	public void showRequestedInfo(){

		System.out.println("Que informacion desea ver?\n" + 
		" 1) Total de reproducciones por audio\n"+
		" 2) Cancion mas vendida de toda la plataforma\n" +
		" 3) Ventas por genero\n"+
		" 4) Top 5 Artistas y Creadores de contenido");
		int op = reader.nextInt();
		reader.nextLine();
		switch(op){
			case 1: 
				System.out.println(objTunes.showInformationNumPlayedAudios());
				break;

			case 2:
				System.out.println(objTunes.findMostSaledSong());
				break;
			case 3:
				System.out.println(objTunes.countGenderSales());
				break;
			
			case 4:
				System.out.println("Top artistas:\n" + objTunes.top5Artist() + "\n" +
				"Top Creadores de contenido:\n " + objTunes.top5Creator());
				break;

		}
		
	}


}