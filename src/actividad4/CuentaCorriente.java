package actividad4;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private double saldo = 0.0;
	private double saldoNuevo;

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String dni, String nombre, double saldo, double saldoNuevo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.saldoNuevo = saldoNuevo;
	}

	public double getSaldoNuevo() {
		return saldoNuevo;
	}

	public void setSaldoNuevo(double saldoNuevo) {
		this.saldoNuevo = saldoNuevo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(double ingreso) {
		saldo = saldo + ingreso;
		System.out.println("Su saldo se ha incrementado a " + saldo);
	}

	public void sacarDinero(double retiro) {
		if (retiro > saldo) {
			System.out.println("Saldo insufieciente, no se puede llevar a cabo la operacion ");
		} else {
			saldo = saldo - retiro;
			System.out.println(" El importe que retira es = " + retiro + ", Su saldo restante es = " + saldo);
		}
	}

	public void mostrarInformacion() {
		System.out.println("Datos del cliente:\nNombre: " + nombre + "\nDni: " + dni + " \nSaldo: " + saldo);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sobreesribiendo el método toString()";
	}

}
