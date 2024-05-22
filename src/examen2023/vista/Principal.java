package examen2023.vista;

import java.util.Scanner;

import examen2023.clases.Medicamento;
import examen2023.colecciones.ClaseCRUD;
import examen2023.excepciones.CodigoNegativoException;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int codigo;
		Medicamento med;
		
		// TODO
		//ClaseCRUD.inicializa();
		
		System.out.println("Introduzca el código del medicamento a modificar");
		codigo = sc.nextInt();
		
		try {
			med = new Medicamento(codigo);
			ClaseCRUD.modificarMedicamento(med);
		} catch (CodigoNegativoException e) {
			System.err.println(e);
		}
	}

}
