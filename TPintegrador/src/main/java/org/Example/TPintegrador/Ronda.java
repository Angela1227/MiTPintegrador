package org.Example.TPintegrador;

public class Ronda {
	private Partido partido;
	private int Ronda;
	

	
	public int getRonda() {
		int i = 1;
		while(!(partido == null)) {
			
			i++;
			return i;	
		}
		Ronda = i;
		return Ronda;
	}


	public void setRonda(int ronda) {
		Ronda = ronda;
	}

	
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
}
