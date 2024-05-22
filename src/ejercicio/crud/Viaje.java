package ejercicio.crud;

public class Viaje {

	private String lugar;
	private String fecha;
	private double precio;

	public Viaje(String lugar, String fecha, double precio) {
		if (lugar != null && !lugar.equals("")) {
			this.lugar = lugar;
		}

		if (fecha != null && !fecha.equals("")) {
			// TODO: Faltan comprobaciones correspondientes a los números
			this.fecha = fecha;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}
	
	public String getLugar() {
		return lugar;
	}

	public String getFecha() {
		return fecha;
	}

	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public boolean equals(Object obj) {
		Viaje viaje = (Viaje) obj;
		
		return this.lugar.equals(viaje.lugar) 
				&& this.fecha.equals(viaje.fecha);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += this.lugar + " - " + this.fecha + " - " + this.precio;
		return res;
	}
}
