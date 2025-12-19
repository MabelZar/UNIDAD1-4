package resolucion;


import java.util.Random;

public class Ejercicio1 {
	
	public int diasMes(String mes) {
		int numDias=0;
		
		
		switch (mes) {
		case  "enero","marzo","junio", "octubre":
			numDias=30;
			break;
		case "agosto","noviembre","diciembre":
			numDias=31;
			break;
		case "febrero":
			numDias=28;
		default:
			
			break;
		}
		
		return numDias;
	}
	
	public void ruleta() {
		Random r=new Random();
	
		int i=0;
		do {
			System.out.println(r.nextInt(101));
			i++;
		} while (i<10);
		System.out.println("contador es = "+i);
	}
	
	public double abonoCuota(String mes, int edad, boolean padresSocios) {
		double cuotaFija=1.90*30;//corregir
		double cuotaFinal=0.0;
		double desc;
		
		if (edad>65) {
			desc=0.50;
			cuotaFinal=cuotaFija-(cuotaFija*desc);
			System.out.println("La cuota final es = "+cuotaFinal);
		} else if (edad<18 && padresSocios==false) {
			desc=0.25;
			cuotaFinal=cuotaFija-(cuotaFija*desc);
			System.out.println("La cuota final es = "+cuotaFinal);
		} else if (edad<18 )  {
			desc=0.35;
			cuotaFinal=cuotaFija-(cuotaFija*desc);
			System.out.println("La cuota final es = "+cuotaFinal);

		}
		
		return cuotaFinal;
	}

}
