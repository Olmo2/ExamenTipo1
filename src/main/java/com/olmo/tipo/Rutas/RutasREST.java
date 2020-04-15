package com.olmo.tipo.Rutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.tipo.Producto.Producto;
import com.olmo.tipo.Producto.ProductoDAO;

@RestController
public class RutasREST {


	@Autowired
	ProductoDAO productoDAO;
	
	@GetMapping("/frescos/add")
	public Producto frecoadd(@ModelAttribute Producto producto) {
		
		productoDAO.save(producto);
		System.out.println(producto);
		
		return producto;
		
	}
	
	@GetMapping("/lacteos/add")
	public Producto lacteoadd(@ModelAttribute Producto producto) {
		
		productoDAO.save(producto);
		System.out.println(producto);
		
		
		
		return producto;
		
	}
}
