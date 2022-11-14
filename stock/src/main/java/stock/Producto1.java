package stock;
/*
 * Producto1 --> Entidad producto1
 */

public class Producto1 {

	// Atributos
	private String nombre;
	private int precio;

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Constructor
	public Producto1(String nombre, int precio) {

		this.nombre = nombre;
		this.precio = precio;
	}

	// Constructor vacio
	public Producto1() {}

}
