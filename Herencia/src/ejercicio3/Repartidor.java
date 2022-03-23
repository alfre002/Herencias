package ejercicio3;

public class Repartidor extends Empleados {

	// atributos
	private String zona;
	
	// constructor
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	// getters y setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	
}
