package actividad3;

public class MatesXY {

	public static int x=0;
	public static int y=0;
	public static int resultado;

	public MatesXY() {
		super();
	}

	

	public static int getX() {
		return x;
	}



	public static void setX(int x) {
		MatesXY.x = x;
	}



	public static int getY() {
		return y;
	}



	public static void setY(int y) {
		MatesXY.y = y;
	}



	public static int getResultado() {
		return resultado;
	}



	public static void setResultado(int resultado) {
		MatesXY.resultado = resultado;
	}


	public static void remplazar() {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("Remplazando los numeros x = " + x + " / y = " + y );
	}
	
	public static void sumar() {

		resultado = x + y;
		System.out.println("La Suma de " + x + " + " + y + " es igual a " + resultado);
	}

	public static void restar() {

		resultado = x - y;
		System.out.println("La resta de " + x + " - " + y + " es igual a " + resultado);
	}

	public static void multiplicar() {

		resultado = x * y;
		System.out.println("La multiplicacion de " + x + " * " + y + " es igual a " + resultado);
	}

	public  static void division() {

		resultado = x / y;
		System.out.println("La Divicion de " + x + " / " + y + " es igual a " + resultado);
	}

	public static void mayor() {
		if (x > y) {
			resultado = x;
		} else {
			resultado = y;
		}
		System.out.println("El numero mayor es = " + resultado);
	}

	public static void iguales() {
		if (x == y) {
			System.out.println("Los numeros " + x + " y " + y + " son iguales ");
		} else {
			System.out.println("Los numeros " + x + " y " + y + " NO son iguales ");
		}

	}

}
