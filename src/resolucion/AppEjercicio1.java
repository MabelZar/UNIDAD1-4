package resolucion;

public class AppEjercicio1 {
	
	public static void main(String[]arg) {
		Ejercicio1 ejercicio1=new Ejercicio1();
		ejercicio1.diasMes("enero");
		System.out.println(ejercicio1.diasMes("febrero"));
		ejercicio1.ruleta();
		
		ejercicio1.abonoCuota("enero", 17, true);
		
	}

}
