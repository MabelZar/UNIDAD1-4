package practica3;

public class AppCentroEducativo {
	
	public static void main(String []arg) {

		Asignatura asignatura1= new Asignatura("Mates");
		Asignatura asignatura2= new Asignatura("Lengua");
		Asignatura asignatura3= new Asignatura("Geo");
		
		Alumno alumno=new Alumno(asignatura1,asignatura2,asignatura3);
		
		Profesor profesor=new Profesor();
		profesor.ponerNotas(alumno);
		
		System.out.println(alumno);
	}
	

}
