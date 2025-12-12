package practica4;

public class AppPunto {
	public static void main(String[]arg) {
		Punto p1=new Punto(2.0,3.0);
		Punto p2=new Punto(5.0,7.0);
		
		double laDistanciaes=p1.calcularDistanciaDesde(p2);
		System.out.println("La distancia entre los puntos es: "+laDistanciaes);
	}

}
