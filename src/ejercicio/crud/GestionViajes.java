package ejercicio.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GestionViajes {
	public static Set<Viaje> viajes;

	public static List<Viaje> buscaViaje(String lugar){
		List<Viaje> listaViajes = new ArrayList<>();
		
		for(Viaje viaje : viajes) {
			if(viaje.getLugar().equals(lugar)) {
				listaViajes.add(viaje);
			}
		}
		
		return listaViajes;
	}
}
