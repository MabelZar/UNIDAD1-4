package actividad6;

import java.util.Scanner;

public class CuentaCorriente {
	String dni;//atributo al que puede acceder la clase y sus vecinas
	public String nombre;
	private double saldo = 0.0;
	private double saldoNuevo;
	private String nombreBanco;

	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String dni, String nombre, double saldo, double saldoNuevo, String nombreBanco) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.saldoNuevo = saldoNuevo;
		this.nombreBanco= nombreBanco;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
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

	public void modificarBanco() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("INgrese el nombre su actual banco");
		nombreBanco=sc.nextLine();
		System.out.println("Ingreses el nombre del nuevo banco");
		nombreBanco=sc.nextLine();
		
		
		
		sc.close();

	}
	public void mostrarInformacion() {
		System.out.println("Datos del cliente:\nNombre: " + nombre + "\nDni: " + dni + " \nSaldo: " + saldo+ "\nNombre del Banco:"+ nombreBanco);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sobreesribiendo el método toString()";
	}

}
