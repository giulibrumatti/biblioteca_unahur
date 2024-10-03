package com.unahur.biblioteca;

import java.util.Iterator;
import java.util.List;

public class Biblioteca {
	
	private List<Libro> listaLibros;
	
	public Biblioteca(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public void agregarLibro(Libro nuevoLibro) {
		if(this. validarLibro(nuevoLibro)) {
			this.listaLibros.add(nuevoLibro);
		}
	}
	
	public Boolean consultarDisponibilidad(Libro unLibro) {
		Boolean salida = false;
		Iterator<Libro> iterador = listaLibros.iterator();
		while (iterador.hasNext()) {
			Libro libro = iterador.next();
			if(libro.getIdLibro().equals(unLibro.getIdLibro())) {
				salida = libro.getEstaDisponible();
			}
		}
		return salida;
	}
	
	private Boolean validarLibro(Libro nuevoLibro) {
		Boolean salida = true;
		Iterator<Libro> iterador = listaLibros.iterator();
		while (iterador.hasNext() && salida) {
			Libro libro = iterador.next();
			if(libro.getIdLibro().equals(nuevoLibro.getIdLibro())) {
				salida = false; 
			}
		}
		return salida;
	}
	
		

}
