package practica1;

public class AppAnimal {
	
	public static void main(String []arg) {
		
		Animal animal=new  Animal();
		animal.setNombre(" animal1 ");
		animal.setEdad(2);
		
		animal.nace();
		System.out.print("Me llamo "+animal.getNombre());
		System.out.print(" y tengo "+animal.getEdad()+" años");
		

		
		   
	}

}
