package practica3;

import java.util.Random;

public class Profesor {

	
	 public void ponerNotas(Alumno alumno) {
		 
	Random random=new Random();
	
	 
	 if(alumno.getAsignaturaUno() != null) {
		 int notaAleatoria=random.nextInt(11);
	 alumno.getAsignaturaUno().setCalificacion(notaAleatoria);
	 }
	 
	 if(alumno.getAsignaturaDos()!=null) {
		 int notaAleatoria=random.nextInt(11);
	 alumno.getAsignaturaDos().setCalificacion(notaAleatoria);
	 }
	 
	 if(alumno.getAsignaturaTres()!=null) {
		 int notaAleatoria=random.nextInt(11);
	 alumno.getAsignaturaTres().setCalificacion(notaAleatoria);
	 }
	 
	 }
}
