package pruebas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Pruebas2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new FileReader("src/pruebas/fichero.txt"));
			
			while (sc.hasNextDouble()) {
				int numero = sc.nextInt();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
