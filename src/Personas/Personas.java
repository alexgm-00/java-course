package Personas;

public class Personas {

	//Atributos
	
	String nombre;
	String apellidos;
	String dni;
	int edad=0;
	int peso;
	float altura;
	char genero;
	
	public Personas(String dni, String nombre, String apellidos, int edad) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	}
	public Personas() {
		dni = "nulo";
		nombre ="anonimo";
		apellidos ="anonimo";
		edad=0;
	}
	
}
