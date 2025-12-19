package resolucion;

public class Farola {
	private boolean bombillaUno=false;
	private boolean bombillaDos=false;
	
	Bombilla farola=new Bombilla();
	
	public boolean enciende() {
		bombillaUno=true;
		bombillaDos=true;
		return bombillaUno && bombillaDos ;
	}
	
	public boolean apaga() {
		bombillaUno=false;
		bombillaDos=false;
		return bombillaUno && bombillaDos ;
	}
	
	public boolean estado() {
		
		boolean est=false;
		if (bombillaUno==true||bombillaUno==true) {
			est=true;
		}
			est=false;
		
		return est ;
	}
	
	public void reparaFarola() {
		
	}

}
