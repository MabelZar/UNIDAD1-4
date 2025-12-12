package practica1;

public class Animal {
	
	private String nombre;
	private int edad;
	
	
	public Animal() {
		super();
	}


	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = 0;
	}
	
	
	
	public  void nace() {
		System.out.print(" Hola, he nacido. ");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	

}
