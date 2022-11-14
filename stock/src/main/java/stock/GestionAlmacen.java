package stock;
/*
 * GestionAlmacen--> Clase de gestion del almacen
 */

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gestionA")
public class GestionAlmacen {

	@Autowired
	RepoProducto1 repo1;

	@Autowired
	RepoProducto2 repo2;

	public void insertarProducto1(Producto1 producto1) {
		repo1.insertar(producto1);
	}

	public void insertarProducto2(Producto2 producto2) {
		repo2.insertar(producto2);
	}

	public ArrayList<Producto1> listProducto1() {
		return repo1.listarTodos();
	}

	public ArrayList<Producto2> listProducto2() {
		return repo2.listarTodos();
	}

}
