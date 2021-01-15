package person;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado=new Scanner(System.in);
		 
			Persona P1= new Persona();
			Persona P2= new Persona();
			
			P1.nombre = teclado.nextLine();
			P1.apellido = teclado.nextLine();
			P1.Dni = teclado.nextLine();
			P1.edad = teclado.nextInt();
			
			P2.nombre = teclado.nextLine();
			P2.apellido = teclado.nextLine();
			P2.Dni = teclado.nextLine();
			P2.edad = teclado.nextInt();
			
	
	}

}
