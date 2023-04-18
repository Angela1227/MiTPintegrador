package org.Example.TPintegrador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Participante {
	//nombre y puntaje 
	private Equipo equipo;
	private String nombre;
	private Partido partido;
	public String getNombre() {
		return nombre;
	}
	public Participante(String nombre, int puntaje) {
		this.nombre = nombre;
		this.puntaje = puntaje;
	}
	
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public EnumResultado getResultado() {
		return resultado;
	}
	public void setResultado(EnumResultado resultado) {
		this.resultado = resultado;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	private int puntaje;
	
	private EnumResultado resultado;
	public int puntaje() {
		// this.resultado -> pred
		EnumResultado resultadoReal = this.partido.resultado(this.equipo);
		if (this.resultado.equals(resultadoReal)) {
			return 1;
		} else {
			return 0;
		}
		
		
		
}
}
