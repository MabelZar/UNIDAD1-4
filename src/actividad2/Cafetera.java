package actividad2;

public class Cafetera {

	private int cantidad;
	private int capMax;

	// constructorVacio
	public Cafetera() {
		cantidad = 0;
	}

	// constructorConParametros

	public Cafetera(int cantidad, int capMax) {
		super();
		this.cantidad =cantidad;
		this.capMax=capMax;
	}

	// getterSetters
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	/* metodosDeLaCafetera */

	public void capacidadMaxima(int cc) {
		this.capMax = cc;
	}

	public void llenarCafetera() {
		cantidad = capMax;
	}

	public void vaciarCafetera() {
		cantidad = 0;
	}

	public void cantidadCafetera() {
		System.out.println("Cantidad actual de la cafetera es: " + cantidad);
	}

	public void agregarCafe(int cc) {
		cantidad = cantidad + cc;
		if(cantidad>capMax) {
			cantidad=capMax;
		}
	}

	public void servirCafe(int cc) {

		if (cantidad == 0) {
			System.out.println("No hay cafe en la cafetera");
		} else if (cc > cantidad) {
			System.out.println("No hay suficiente cafe");
		} else if (cc <= cantidad) {
			System.out.println("Cafe  servido");
			cantidad= cantidad-cc;
		}
		
	
	}

}
