package resolucion;

public class AppFarola {
	public static void main (String []arg) {
		Farola f1=new Farola();
		f1.enciende();
		System.out.println("Esta encendida la farola? "+f1.enciende());
		f1.apaga();
		System.out.println(f1.apaga());
		f1.enciende();
	}

}
