package com.caballero.pruebas;

public class Espada extends Arma {
	
	private String tipoFilo;

	public Espada(Integer poder, String tipoFilo) {
		super("Espada", poder);
		this.tipoFilo = tipoFilo;
	}

	public String getTipoFilo() {
		return tipoFilo;
	}

	public void setTipoFilo(String tipoFilo) {
		this.tipoFilo = tipoFilo;
	}
	
}