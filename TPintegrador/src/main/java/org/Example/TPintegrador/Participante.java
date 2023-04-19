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
	private Pronostico pronostico;
	private int puntaje;
	private EnumResultado resultado;
	

	
	//para llamar al participante
	public Participante(String nombre, int puntaje) {
		this.nombre = nombre;
		this.puntaje = puntaje;
	}
	
	//los getter y setters
	public String getNombre() {
		return nombre;
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
	
	
	//establezco el puntaje
	public  int getPuntaje() {
		return puntaje;
	}
	//establezo que puntaje se relaciona con puntos
	public void setPuntaje(int puntaje) {
		this.puntaje = pronostico.puntos();
	}
	
	
	
	
	
	
		
		
		

}
