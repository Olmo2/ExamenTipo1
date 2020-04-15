package com.olmo.tipo.Rutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.tipo.Producto.Producto;
import com.olmo.tipo.Producto.ProductoDAO;
import com.olmo.tipo.Servicios.Servicios;

@RestController
public class RutasREST {

	
	@Autowired
	ProductoDAO productoDAO;
	
	@GetMapping("/frescos/add")
	public String frecoadd(@ModelAttribute Producto producto) {
		
		productoDAO.save(producto);
		Servicios.fresco(producto);
		
		return "redirect:/formulario";
		
	}
	
	@GetMapping("/lacteos/add")
	public String lacteoadd(@ModelAttribute Producto producto) {
		
		productoDAO.save(producto);
		Servicios.lacteo(producto);
		
		
		
		return "redirect:/formulario";
		
	}
}
