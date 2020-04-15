package com.olmo.tipo.Servicios;

import org.springframework.stereotype.Service;

import com.olmo.tipo.Producto.Producto;

@Service
public class Servicios {

	
	public static void lacteo(Producto producto) {
		
		System.out.println(producto);
	}
	

	public static void fresco(Producto producto) {
		
		System.out.println(producto);
	}
}
