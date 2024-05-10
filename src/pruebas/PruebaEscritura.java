package pruebas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PruebaEscritura {

	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		
		try {
			bw =  new BufferedWriter(new FileWriter("src/pruebas/fichero.txt", true));
			bw.write("volvemos a cambiar");
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
