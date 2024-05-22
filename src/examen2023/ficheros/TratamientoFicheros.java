package examen2023.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import examen2023.clases.Medicamento;

public class TratamientoFicheros {
	public static final String NOMBRE_FICHERO = "src/examen2023/archivos/medicamentos.txt";

	public static void escribeFichero(Set<Medicamento> listadoMedicamentos) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(NOMBRE_FICHERO));
			String linea;
			for (Medicamento med : listadoMedicamentos) {
				linea = "";
				linea += med.getCodigo() + ";";
				linea += med.getNombre() + ";";
				linea += med.getDescripcion() + ";";
				linea += med.getPrecio() + ";";
				linea += med.getPosologia();

				bw.write(linea);
				bw.newLine();
			}

		} catch (IOException e) {
			System.err.println("La ruta del fichero no es correcta");
			System.err.println(e);
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (IOException e) {
				System.err.println("Ha habido un error al terminar de escribir el fichero");
			}
		}

	}
}
