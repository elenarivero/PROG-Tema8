package ejercicio.crud;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Ficheros {

	public static final String rutaFichero = "src/ejercicio/crud/datosTurismo.txt";
	
	public static Set<Viaje> leeFichero(){
		
		Set<Viaje> viajes = new HashSet<>();
		String linea;
		String[] viaje; 
		
		double precio;
		Viaje v1;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(rutaFichero));
			linea = br.readLine();
				
			while(linea != null) {
				viaje = linea.split("::");
				
				precio =  Double.parseDouble(viaje[2]);
				v1 = new Viaje(viaje[0], viaje[1], precio);
				
				viajes.add(v1);
				
				linea = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		} catch (IOException e) {
			System.err.println("Ha habido algún error en la lectura del fichero");
		}
		
		return viajes;
	}
}
