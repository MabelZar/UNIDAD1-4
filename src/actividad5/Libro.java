package actividad5;

public class Libro {

	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numPrestados;

	public Libro() {
		super();
	}

	public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumPrestados() {
		return numPrestados;
	}

	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}

	public boolean prestamo() {
		if (numPrestados < numEjemplares) {
			numPrestados++;
			return true;
		} else {
			System.out.println("Su prestamo NO es posible : ");
			return false;
		}

	}

	public boolean devolucion() {
		if (numPrestados > 0) {
			numPrestados--;
			return true;
		} else {
			System.out.println("NO puede devolver, no se presto ningun libro: ");
			return false;
		}
	}

	@Override
	public String toString() {
		int disponibles =numEjemplares-numPrestados;
		return "Libro[Titulo: " + titulo + ", Autor : " + autor + ", Ejemplares: " + numEjemplares + ", Prestados: "
				+ numPrestados + "disponibles: "+disponibles+"]";
	}

}
