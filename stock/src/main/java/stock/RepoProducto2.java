package stock;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

/*
 * RepoProducto2--> Repositorio para producto 2
 */
@Repository
public class RepoProducto2 {

	private static ArrayList<Producto2> listProducto2 = new ArrayList<Producto2>();
//Creamos los objetos en momento de ejecución
	static {
		listProducto2.add(new Producto2("ordenador1", 200));
		listProducto2.add(new Producto2("ordenador2", 400));
		listProducto2.add(new Producto2("ordenador3", 2000));
	}
//Listamos todos los objetos
	public ArrayList<Producto2> listarTodos() {
		return listProducto2;
	}
//Insertamos todos los objetos
	public void insertar(Producto2 Producto2) {
		listProducto2.add(Producto2);
	}

}
