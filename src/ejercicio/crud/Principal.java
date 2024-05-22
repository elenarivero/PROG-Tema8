package ejercicio.crud;

import static ejercicio.crud.GestionViajes.*;

import java.util.List;
import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc;
		Viaje viaje;
		int numViaje;
		
		// Cargamos los datos del fichero
				viajes = Ficheros.leeFichero();
		do {
			menu();
			opc = sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			case 1: 
				for(Viaje v : viajes) {
					System.out.println(v);
				}
				break;
			case 2:
				viaje = nuevoViaje();
				viajes.add(viaje);
				break;
			case 3:
				viaje = seleccionaViaje();
				// modificaViaje()
				break;
			case 4:
				viaje = seleccionaViaje();
				viajes.remove(viaje);
				break;
			}
		} while (opc != 6);
		
		sc.close();
	}

	private static void menu() {
		System.out.println("1. Listar viajes");
		System.out.println("2. Añadir viaje");
		System.out.println("3. Modificar viaje");
		System.out.println("4. Eliminar viaje");
		System.out.println("5. Guardar");
		System.out.println("6. Salir");
		System.out.println("Introduzca una opción");
	}
	
	private static Viaje nuevoViaje() {
		Viaje viaje;
		String lugar;
		String fecha;
		double precio;
		
		System.out.println("Introduzca el lugar");
		lugar = sc.nextLine();
		
		System.out.println("Introduzca la fecha");
		fecha = sc.next();
		sc.nextLine();
		
		System.out.println("Introduzca el precio");
		precio = sc.nextDouble();
		sc.nextLine();
		
		viaje = new Viaje(lugar, fecha, precio);
		
		return viaje;
	}
	
	private static Viaje seleccionaViaje() {
		List<Viaje> listaViajes;
		String lugar;
		int cont = 1;
		int opc = 0;
		
		System.out.println("Introduzca el lugar a modificar");
		lugar = sc.nextLine();
		
		listaViajes = buscaViaje(lugar);
		
		if(!listaViajes.isEmpty()) {
			for(Viaje viaje:listaViajes) {
				System.out.println(cont + ". " + viaje);
			}
			System.out.println("Seleccione uno de los viajes:");
			opc = sc.nextInt();
			sc.nextLine();
		}
		return listaViajes.get(opc-1);
	}
}
