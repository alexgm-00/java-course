package Personas;

public class Mainpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

Personas P1= new Personas("12345678J","Adrian","Rosello",3);
Personas P2= new Personas();

System.out.println("Me llamo " + P1.nombre +" me apellido " +P1.apellidos + " y tengo "+ P1.edad + " años mentales");
System.out.println("Me llamo " + P2.nombre +" me apellido " +P2.apellidos + " y tengo "+ P2.edad + " años");

	}

}
