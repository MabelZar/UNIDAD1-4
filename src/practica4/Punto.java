package practica4;

public class Punto {
	private Double x;
	private Double y;
	
	public Punto(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto() {
		super();
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
	public Double calcularDistanciaDesde(Punto parametro_punto) {
		
		double dx=this.x - parametro_punto.getX();
		double dy=this.y - parametro_punto.getY();
		double distancia=Math.sqrt(dx*dx+dy*dy);
		return distancia;
		
		
	}


}
