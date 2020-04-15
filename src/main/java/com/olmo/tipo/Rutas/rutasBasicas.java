package com.olmo.tipo.Rutas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.olmo.tipo.Producto.Producto;
import com.olmo.tipo.Producto.ProductoDAO;


@Controller
public class rutasBasicas {

	@Autowired
	ProductoDAO productoDAO;
	
	@GetMapping("/formulario")
	public String formulario(@ModelAttribute Producto producto) {
		
		
		return "formulario";

	}
	
	@PostMapping("/producto")
	public RedirectView productoEvaluar(
			RedirectAttributes redir,
			RedirectView redirectView,
			@ModelAttribute Producto producto) {
		

		redirectView = new RedirectView("/formulario",true);
		
	    redir.addFlashAttribute("producto", producto );
	    
		switch(producto.getTipo()) {
		
		case "especia":{
			System.out.println("Especia");
			productoDAO.save(producto);
			return redirectView;
		}
		case "fresco":{
			System.out.println("Fresco");
			redirectView = new RedirectView("/frescos/add",true);
			
			return redirectView;
		}
		case "lacteo":{
			System.out.println("Lacteo");
			redirectView = new RedirectView("/lacteos/add",true);
			
			return redirectView;
			
		}
		default: return redirectView;
		
		}
		
	}
	
	
	
}
