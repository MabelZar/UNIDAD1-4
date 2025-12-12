package practica2;

public class AppCoche {
	
	public static void main( String[]arg) {
		
		Coche cocheVendedor=new Coche("XXMOD", "ROJO", false, "XXMATR", "TODO");
		System.out.println("El coche del vendedor "+ cocheVendedor.ImprimirCoche());
		
		Coche cocheEmpresaCoche=new Coche("dos", "azul", true, "MAT", "PARTE");
		System.out.println("El coche de Empresa "+ cocheEmpresaCoche.ImprimirCoche());
		
		Coche cocheDirector=new Coche("tres", "negro", true, "MAT", "nada");
		System.out.println("El coche de Empresa "+ cocheDirector.ImprimirCoche());
		
		
	}

}
