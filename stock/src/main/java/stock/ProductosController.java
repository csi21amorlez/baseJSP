package stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductosController{
	
    
    @Autowired 
    GestionAlmacen gestorTorre;
   
    @RequestMapping("/listaproductos1") 
    public String listaProductos1(Model modelo) {
   
    modelo.addAttribute("listaproductos1",gestorTorre.listProducto1());
   return "listaproductos1"; }

}


