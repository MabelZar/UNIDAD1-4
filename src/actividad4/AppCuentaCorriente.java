package actividad4;

public class AppCuentaCorriente {
	
	public static void main(String[]arg) {
		CuentaCorriente cuentaCorriente=new CuentaCorriente();
		
		cuentaCorriente.setDni("1100000C");
		cuentaCorriente.setNombre("Pepe");
		
		cuentaCorriente.ingreso(1000);
		cuentaCorriente.mostrarInformacion();
		cuentaCorriente.sacarDinero(300);
		cuentaCorriente.sacarDinero(500);
		cuentaCorriente.sacarDinero(300);
		
		System.out.println(cuentaCorriente.toString());
		
		
	}
	
	

}
