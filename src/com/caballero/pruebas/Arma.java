package com.caballero.pruebas;

public class Arma implements Portable {
	
	private String nombre;
	private Integer poder;
	
	public Arma(String nombre, Integer poder) {
		this.nombre = nombre;
		this.poder = poder;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}

	@Override
	public void atacar() {
		System.out.println("Estoy atacando");
	}
	
}