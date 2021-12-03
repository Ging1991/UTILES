package com.caballero;

import com.caballero.lupa.Lupa;
import com.caballero.pruebas.Arma;
import com.caballero.pruebas.Espada;
import com.caballero.pruebas.Persona;
import com.caballero.pruebas.Portable;

public class Principal {
	
	public static void main(String[] args) {
		Persona persona = new Persona("Reiko", "Mikami", 21);
		Arma arma = new Arma("Lanza", 150);
		Espada espada = new Espada(99, "Invertido");
		Object objeto = new Object();
		Portable portable = new Arma("Shuriken", 15);
		
		Lupa.mostrar(persona);
		Lupa.mostrar(arma);
		Lupa.mostrarCompleto(espada);
		Lupa.mostrarCompleto(objeto);
		Lupa.mostrar(portable);
		Lupa.mostrarCompleto(portable);
		
	}

}
