package examen2023.clases;

import java.util.Objects;

import examen2023.excepciones.CodigoNegativoException;

public class Medicamento implements Comparable<Medicamento>{

	private int codigo = 1;
	private String nombre = "";
	private String descripcion = "";
	private double precio = 0;
	private String posologia = "";
	
	public Medicamento(int codigo) throws CodigoNegativoException {
		comprobarCodigo(codigo);
	}
	
	public Medicamento(int codigo, String nombre, String descripcion) throws CodigoNegativoException {
		this(codigo);
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
	}
	
	public Medicamento(int codigo, String nombre, String descripcion, double precio, String posologia) throws CodigoNegativoException {
		this(codigo, nombre, descripcion);
		
		if(precio > 0) {
			this.precio = precio;
		}
		
		if(posologia != null && !posologia.equals("")) {
			this.posologia = posologia;
		}
	}

	public void setCodigo(int codigo) throws CodigoNegativoException {
		comprobarCodigo(codigo);
	}

	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
	}

	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		if(posologia != null && !posologia.equals("")) {
			this.posologia = posologia;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param codigo
	 * @throws CodigoNegativoException
	 */
	private void comprobarCodigo(int codigo) throws CodigoNegativoException {
		if(codigo > 0) {
			this.codigo = codigo;
		} else {
			throw new CodigoNegativoException();
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
		Medicamento med = (Medicamento) obj;
		
		// Dos medicamentos son iguales si tienen mismo código y mismo nombre
		if(this.codigo == med.codigo && this.nombre.equalsIgnoreCase(med.nombre)) {
			iguales = true;
		}
		
		return iguales;
	}
	
	@Override
	public int compareTo(Medicamento o) {
		int res;

		if (this.codigo < o.codigo) {
			res = -1;
		} else if(this.codigo > o.codigo) {
			res = 1;
		} else {
			res = this.nombre.compareTo(o.nombre);
		}
		
		return res;
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Código: " + this.codigo + "\n"; 
		res += "Nombre: " + this.nombre + "\n"; 
		res += "Descripción: " + this.descripcion + "\n"; 
		res += "Precio: " + this.precio + "\n"; 
		res += "Posología: " + this.posologia + "\n"; 
		res += "-----------------------------------------";
		return res;
	}

}
