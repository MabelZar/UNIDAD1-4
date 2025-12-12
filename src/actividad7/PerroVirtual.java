package actividad7;

public class PerroVirtual {

	private String nombre;
	private int energia=20;
	private String mensaje;

	public PerroVirtual() {
		super();
	}

	public PerroVirtual(String nombre, int energia, String mensaje) {
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int comer() {
		this.energia=this.energia+5;
		return this.energia;
	}
	
	public int hacerEjercicio() {
		this.energia=this.energia-3;
		return this.energia;
	}
	
	public int dormir() {
		this.energia=this.energia+2;
		return this.energia;
		
	}
	public int irAlVeterinario() {
		this.energia=20;
		return this.energia;
	}
	

}
