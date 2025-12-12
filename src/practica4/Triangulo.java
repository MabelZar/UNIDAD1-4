package practica4;

public class Triangulo {
	
	private Punto punto1;
	private Punto punto2;
	private Punto punto3;
	
	public Triangulo() {
		super();
	}

	

	public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
		super();
		this.punto1 = punto1;
		this.punto2 = punto2;
		this.punto3 = punto3;
	}



	public Triangulo(double x1, double y1, double x2,double y2,double x3,double y3) {
		super();
		this.punto1 = new Punto(x1,y1);
		this.punto2 = new Punto(x2,y2);
		this.punto3 = new Punto(x3,y3);
	}



	public Punto getPunto1() {
		return punto1;
	}



	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}



	public Punto getPunto2() {
		return punto2;
	}



	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}



	public Punto getPunto3() {
		return punto3;
	}



	public void setPunto3(Punto punto3) {
		this.punto3 = punto3;
	}
	
	public Double calcularArea() {
		double x1=punto1.getX();
		double y1=punto1.getY();
		double x2=punto2.getX();
		double y2=punto2.getY();
		double x3=punto3.getX();
		double y3=punto3.getY();
		
		double area=Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
		return area;
	}
	
	public Double calcularPerimetro(){
		
		double x1=punto1.getX();
		double y1=punto1.getY();
		double x2=punto2.getX();
		double y2=punto2.getY();
		double x3=punto3.getX();
		double y3=punto3.getY();
		double a=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		double b=Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2));
		double c=Math.sqrt(Math.pow(x1-x3,2)+ Math.pow(y1-y3,2));
		
		double perimetro= a+b+c;
		
		
		return perimetro;
	}
	
	
	
	
	

}
