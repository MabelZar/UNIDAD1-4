package actividad5;

import java.util.Scanner;

public class AppLibro {
	
	public static void main(String[]arg) {
		
		Scanner sc=new Scanner(System.in);
		Libro libro1=new Libro();
		
		
		libro1.setTitulo("EL Quijote");
		libro1.setAutor("Cervantes");
		libro1.setNumEjemplares(2);
		libro1.setNumPrestados(1);//prestamo1
		
		/*System.out.println("Estado inicial: "+libro);
		System.out.println("Prestamo: "+libro.prestamo());	
		System.out.println("Estado: "+libro);
		System.out.println("Devolucion: "+libro.devolucion());
		System.out.println("Estado: "+libro);*/
		
		
		Libro  libro2=new Libro();
		System.out.println("Ingrese el titulo del libro: ");
		libro2.setTitulo(sc.nextLine());
		System.out.println("Ingrese el autor del libro: ");
		libro2.setAutor(sc.nextLine());
		System.out.println("Ingrese los ejemplares que tiene : ");
		libro2.setNumEjemplares(sc.nextInt());
		System.out.println("Libro2 es: " + libro2);
		System.out.println("prestamo de libro: ");
		libro2.prestamo();
		System.out.println(libro2);
		
		
	}

}
