package actividad7;

import java.util.Scanner;

public class AppPerroVirtual {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		PerroVirtual perroVirtual = new PerroVirtual();

		int opcion = -1;
		int acumulador = 0;

		while (opcion != 0) {
			System.out.println("\n=== MENU ===");
			System.out.println("1- Nacer");
			System.out.println("2- Comer");
			System.out.println("3- Hacer ejercicio");
			System.out.println("4- Dormir");
			System.out.println("5- Ir al veterinario");
			System.out.println("6- Consultar nivel de energía");
			System.out.println("0- Salir");
			System.out.print("Elija una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				System.out.println("Ingrese el nombre del perro:");
				
				perroVirtual.setNombre(sc.nextLine());
				acumulador = perroVirtual.getEnergia();
				System.out.println("Su nombre asignado es: " + perroVirtual.getNombre() + " su energia es "
						+ perroVirtual.getEnergia());

				break;
			case 2:
				int energiaGanada=perroVirtual.comer();
				acumulador = acumulador + energiaGanada;
				System.out.println("el perro comio " + energiaGanada);
				
				break;
			case 3:
				int energiaEjercicio=perroVirtual.hacerEjercicio();
				acumulador = acumulador + energiaEjercicio;
				System.out.println("el perro hizo ejercicio " + energiaEjercicio);
				
				break;
			case 4:
				int energiaDormir=perroVirtual.dormir();
				acumulador = acumulador + energiaDormir;
				System.out.println("el perro durmio " + energiaDormir);
				
				break;
			case 5:
				int energiaVet=perroVirtual.irAlVeterinario();
				acumulador = energiaVet;
				System.out.println("fue al veterinario" + energiaVet);
				
				break;
			case 6:
				
				System.out.println("su energia acumulada es " + acumulador);
				System.out.println("su energia actual es "+ perroVirtual.getEnergia());
				break;

			default:
				break;
			}
		}

	}

}
