package practica3;

public class Alumno {
	private Asignatura asignaturaUno;
	private Asignatura asignaturaDos;
	private Asignatura asignaturaTres;
	



	public Alumno(Asignatura asignaturaUno) {
		super();
		this.asignaturaUno = asignaturaUno;
	}
	public Alumno(Asignatura asignaturaUno, Asignatura asignaturaDos) {
		super();
		this.asignaturaUno = asignaturaUno;
		this.asignaturaDos = asignaturaDos;
	}

	public Alumno(Asignatura asignaturaUno, Asignatura asignaturaDos, Asignatura asignaturaTres) {
		super();
		this.asignaturaUno = asignaturaUno;
		this.asignaturaDos = asignaturaDos;
		this.asignaturaTres = asignaturaTres;
	}
	
	public Asignatura getAsignaturaUno() {
		return asignaturaUno;
	}

	public Asignatura getAsignaturaDos() {
		return asignaturaDos;
	}

	public Asignatura getAsignaturaTres() {
		return asignaturaTres;
	}
	@Override
	public String toString() {
		return asignaturaUno + ", " + asignaturaDos + ", "+asignaturaTres ;
	}
	

}
