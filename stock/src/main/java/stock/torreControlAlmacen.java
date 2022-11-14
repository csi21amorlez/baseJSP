package stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class torreControlAlmacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		GestionAlmacen gestor = (GestionAlmacen) context.getBean("gestionA");
		System.out.println(gestor.listProducto1());
		System.out.println(gestor.listProducto2());
		
	}

}
