package stock;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

/*
 * RepoProducto1--> Repositorio para producto 1
 */
@Repository
public class RepoProducto1 {

	private static ArrayList<Producto1> listProducto1 = new ArrayList<Producto1>();
//Creamos los objetos en momento de ejecución
	static {
		listProducto1.add(new Producto1("teclado1", 200));
		listProducto1.add(new Producto1("teclado2", 400));
		listProducto1.add(new Producto1("teclado3",2000));
	}
//Listamos todos los objetos
	public ArrayList<Producto1> listarTodos() {
		return listProducto1;
	}
//Insertamos todos los objetos
	public void insertar(Producto1 producto1) {
		listProducto1.add(producto1);
	}

}
