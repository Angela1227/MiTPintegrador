package org.Example.TPintegrador;

import java.util.List;

import com.opencsv.bean.CsvBindByPosition;

import models.Pronostico;

public class Participante {
	
	//Creo el csv para poder mostrar a los participantes
	
	@CsvBindByPosition(position = 0)
    private Integer ronda;
    @CsvBindByPosition(position = 2)
    private String participante;
    @CsvBindByPosition(position = 1)
    private Integer puntos;
	
	static void main(String[] args) {
	
		
		
	Lector lector = new Lector();
	List<Pronostico> listadepronosticos = lector.parsearPronosticos("src\\main\\java\\models\\pronosticos");
	
	//pronostico: participante
	for(Pronostico pronostico: listadepronosticos) {
		String participante = pronostico.getParticipante();
	}
	
	
	}
	
	
	
	public int getRonda() {
		return ronda;
	}
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	public String getParticipante() {
		return participante;
	}
	public void setParticipante(String participante) {
		this.participante = participante;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	


}

