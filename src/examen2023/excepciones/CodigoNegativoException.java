package examen2023.excepciones;

public class CodigoNegativoException extends Exception{
	@Override
	public String toString() {
		return "El código del medicamento no puede ser menor que 1";
		
	}
	
	@Override
	public String getMessage() {
		String res = super.getMessage();
		res += this.getClass() + "El código del medicamento no puede ser menor que 1";
		return res;
	}
}
