package actividad2;

public class AppCafetera {
	
	public static void main(String[] arg) {
		
		
		Cafetera cafetera=new Cafetera();
		cafetera.capacidadMaxima(1000);
		
		cafetera.llenarCafetera();
		cafetera.cantidadCafetera();
		cafetera.vaciarCafetera();
		cafetera.cantidadCafetera();
		cafetera.agregarCafe(300);
		cafetera.cantidadCafetera();
		cafetera.servirCafe(500);
		cafetera.servirCafe(100);
		cafetera.cantidadCafetera();
	
		
	}

}
