package practica2;

public class Coche {
	
	private String marcaModelo;
	private String color;
	private boolean tipoPintura;
	private String matricula;
	private String tipoSeguro;
	
	public Coche(String marcaModelo, String color, boolean tipoPintura, String matricula, String tipoSeguro) {
		super();
		this.marcaModelo = marcaModelo;
		this.color = color;
		this.tipoPintura = tipoPintura;
		this.matricula = matricula;
		this.tipoSeguro = tipoSeguro;
	}

	public String getMarcaModelo() {
		return marcaModelo;
	}

	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(boolean tipoPintura) {
		this.tipoPintura = tipoPintura;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	//metodo para devolver un string
	public String ImprimirCoche() {
		return "es el modelo " +getMarcaModelo()+", de color "+getColor()+
				//imprimir booleano
				(isTipoPintura()? ", metalizado ": "" )+ ", con matricula "+ getMatricula()+" y seguro a "+ getTipoSeguro();
	}
	

}
