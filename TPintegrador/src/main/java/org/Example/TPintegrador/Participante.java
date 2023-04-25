package org.Example.TPintegrador;

import com.opencsv.bean.CsvBindByPosition;

public class Participante {
	
	//Creo el csv para poder mostrar a los participantes
	
	@CsvBindByPosition(position = 0)
	private int ronda;
	@CsvBindByPosition(position = 1)
	private String participante;
	@CsvBindByPosition(position = 2)
	private int puntos;
	
	
	
	
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

