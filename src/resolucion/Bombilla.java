package resolucion;

import java.util.Random;

public class Bombilla {
	private boolean interruptor=false;
	
	public void enciende() {
		Random r=new Random();
		
		int num=r.nextInt(101);
		if (num <60) {
			interruptor=true;
		}
		System.out.println("el numero es: "+num+" / enciende: "+interruptor);
	}
	public void apaga() {
		interruptor=false;
		System.out.println("se apago: "+interruptor);
	}
	
	public boolean estado() {
		boolean s;
		if (interruptor==true) {
			s=true;
		} else {
			s=false;
		}
		return s;
	}
	
	public void cambiarBombilla() {
		
	}
	

}
