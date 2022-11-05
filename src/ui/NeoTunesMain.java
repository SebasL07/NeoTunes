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

		System.out.println("Que opcion del menu desea realizar? \n" + 
		" 1) Registrar usuario consumidor \n" + 
		" 2) Registrar usuario productor\n ");
		int option = reader.nextInt();

		return option;
	}

	public void executeOp(int op){

		switch(op){

			case 1: 
				addConsumer();
				break;

			case 2:
				
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

		switch(option){

			case 1:
				addConsumerStandard();
				break;
			case 2:
				addConsumerPremium();
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

		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();

		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();

		objTunes.addConsumerStandard(nickname, id, day, month, year);
	}

	public void addConsumerPremium(){

		System.out.println("Ingrese el nickname del usuario");
		String nickname = reader.next();

		System.out.println("Ingrese la cedula del usaurio");
		String id = reader.next();

		System.out.println("Ingrese que dia de hoy (Solo numero)");
		int day = reader.nextInt();

		System.out.println("Ingrese en que mes estamos (Solo numero)");
		int month = reader.nextInt();

		System.out.println("Ingrese en que anio estamos (Solo numero)");
		int year = reader.nextInt();

		objTunes.addConsumerPremium(nickname, id, day, month, year);
	}
}