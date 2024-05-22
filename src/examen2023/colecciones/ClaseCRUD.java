package examen2023.colecciones;

import java.util.Set;
import java.util.TreeSet;

import examen2023.clases.Medicamento;

public class ClaseCRUD {
	
	
	public static Set<Medicamento> listaMedicamentos = new TreeSet<>();

//	public void inicializa() {
//		listadoMedicamentos = TratamientoFicheros.leeFichero();
//	}
	
	public static boolean modificarMedicamento(Medicamento med) {
		
		boolean res = false;
		
		if(listaMedicamentos.contains(med)) {
			for(Medicamento valor : listaMedicamentos) {
				if(valor.equals(med)) {
					
				}
			}
		} 
		
		
		return res;
	}
}
