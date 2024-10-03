package com.unahur.biblioteca;

public class Libro {
	
	private Integer idLibro;
	private String titulo;
	private String auto;
	private String isbn;
	private Boolean estaDisponible;
	
	public Libro(String titulo, String auto, String isbn, Boolean estaDisponible) {
		this.titulo = titulo;
		this.auto = auto;
		this.isbn = isbn;
		this.estaDisponible = estaDisponible;
	}
	
	protected Integer getIdLibro() {
		return this.idLibro;
	}
	
	protected Boolean getEstaDisponible() {
		return this.estaDisponible;
	}
	
	

}
