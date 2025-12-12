package practica3;

public class Asignatura {
	
	private String nombreAsignatura;
	private Integer calificacion;
	
	

	public Asignatura(String nombreAsignatura) {
		super();
		this.nombreAsignatura = nombreAsignatura;
		
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return  nombreAsignatura + " nota=" + calificacion
				;
	}
	
	
	

}
